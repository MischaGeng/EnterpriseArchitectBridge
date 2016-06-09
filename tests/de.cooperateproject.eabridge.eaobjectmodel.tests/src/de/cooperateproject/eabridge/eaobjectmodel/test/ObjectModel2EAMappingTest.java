package de.cooperateproject.eabridge.eaobjectmodel.test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

import org.apache.commons.io.IOUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;
import org.junit.Assert;
import org.xmlunit.builder.DiffBuilder;
import org.xmlunit.diff.Diff;
import org.xmlunit.diff.DifferenceEvaluator;
import org.xmlunit.diff.DifferenceEvaluators;

import de.cooperateproject.eabridge.eaobjectmodel.Package;
import de.cooperateproject.eabridge.eaobjectmodel.test.util.IgnoreAttributeDifferenceEvaluator;
import de.cooperateproject.eabridge.eaobjectmodel.test.util.TestResource;
import de.cooperateproject.eabridge.eaobjectmodel.util.EAObjectModelHelper;
import liquibase.Liquibase;
import liquibase.diff.DiffResult;
import liquibase.diff.output.DiffOutputControl;
import liquibase.diff.output.changelog.DiffToChangeLog;
import liquibase.structure.core.Data;

public class ObjectModel2EAMappingTest extends TeneoMappingBaseTest {

	@Test
	public void testAddModel() throws Exception {
		initTestDb(TestResource.EASchemaChangelog);

		Package loadedPackage = loadModelFromResource("resources/SimpleClassModel.xmi");
		Session session = getDataStore().getSessionFactory().openSession();
		Transaction trans = session.getTransaction();

		trans.begin();
		session.save(loadedPackage);
		trans.commit();

		String content = generateChangelog();
		String compareContent = readFile(TestResource.SimpleClassModelChangelog.getFile().getAbsolutePath(),
				Charset.defaultCharset());

		Diff myDiff = DiffBuilder.compare(compareContent).withTest(content).withDifferenceEvaluator(DifferenceEvaluators
				.chain(new IgnoreAttributeDifferenceEvaluator("author"), new IgnoreAttributeDifferenceEvaluator("id")))
				.checkForSimilar().build();

		Assert.assertFalse(myDiff.toString(), myDiff.hasDifferences());
	}

}
