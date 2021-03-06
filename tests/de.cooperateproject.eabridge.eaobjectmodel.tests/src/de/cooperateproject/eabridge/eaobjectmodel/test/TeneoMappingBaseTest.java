package de.cooperateproject.eabridge.eaobjectmodel.test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.spi.Filter;
import org.apache.log4j.spi.LoggingEvent;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

import de.cooperateproject.eabridge.eaobjectmodel.Package;
import de.cooperateproject.eabridge.eaobjectmodel.test.util.LiquibaseFactory;
import de.cooperateproject.eabridge.eaobjectmodel.test.util.LiquibaseFactory.LiquibaseLogger;
import de.cooperateproject.eabridge.eaobjectmodel.test.util.MySQLTestDB;
import de.cooperateproject.eabridge.eaobjectmodel.test.util.TestResource;
import de.cooperateproject.eabridge.eaobjectmodel.util.EAObjectModelHelper;
import liquibase.CatalogAndSchema;
import liquibase.Liquibase;
import liquibase.diff.output.DiffOutputControl;
import liquibase.diff.output.changelog.DiffToChangeLog;
import liquibase.exception.DatabaseException;
import liquibase.structure.core.Data;

public abstract class TeneoMappingBaseTest {

	private MySQLTestDB testDb;

	@BeforeClass
	public static void init() {
		BasicConfigurator.resetConfiguration();
		final ConsoleAppender appender = new ConsoleAppender(new PatternLayout("%m%n"));
		appender.setThreshold(Level.INFO);
		appender.addFilter(new Filter() {
			@Override
			public int decide(LoggingEvent arg0) {
				if (LiquibaseLogger.class.getName().equals(arg0.getLoggerName())) {
					if (arg0.getLevel().toInt() <= Level.INFO_INT) {
						return Filter.DENY;
					}
				}
				if (HbDataStore.class.getName().equals(arg0.getLoggerName())) {
					if (arg0.getLevel().toInt() <= Level.INFO_INT) {
						return Filter.DENY;
					}
				}
				return Filter.NEUTRAL;
			}
		});
		BasicConfigurator.configure(appender);
		LiquibaseFactory.init();
	}

	@Before
	public void setup() throws Exception {
		testDb = null;
	}

	@After
	public void finalize() throws Exception {
		testDb.close();
	}

	protected String readFile(File f, Charset encoding) throws IOException {
		byte[] encoded = Files.readAllBytes(Paths.get(f.getAbsolutePath()));
		return new String(encoded, encoding);
	}

	@SuppressWarnings("unchecked")
	protected String generateChangelog() throws DatabaseException, IOException, ParserConfigurationException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		try {
			Liquibase liquibase = getLiquibase();
			CatalogAndSchema defaultSchema = liquibase.getDatabase().getDefaultSchema();
			DiffOutputControl diffOutputControl = new DiffOutputControl();
			liquibase.generateChangeLog(defaultSchema, new DiffToChangeLog(diffOutputControl), ps, Data.class);
			return baos.toString();
		} finally {
			IOUtils.closeQuietly(ps);
			IOUtils.closeQuietly(baos);
		}
	}

	protected void initTestDb(TestResource testResource) throws Exception {
		testDb = new MySQLTestDB(testResource, "test");
	}

	public Connection getDbConnection() {
		return testDb.getDbConnection();
	}

	public HbDataStore getDataStore() {
		return testDb.getDataStore();
	}

	public Liquibase getLiquibase() {
		return testDb.getLiquibase();
	}

	public static Package loadModelFromResource(String resourcePath) throws IOException {
		Package loadedPackage = null;
		InputStream is = null;
		try {
			is = ObjectModel2EAMappingTest.class.getClassLoader().getResourceAsStream(resourcePath);
			loadedPackage = EAObjectModelHelper.loadModel(is);
		} finally {
			IOUtils.closeQuietly(is);
		}
		return loadedPackage;
	}

}
