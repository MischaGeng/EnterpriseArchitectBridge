package de.cooperateproject.eabridge.eaobjectmodel;

import java.util.List;

import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeConstraint;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeTag;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorType;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Element;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Method;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Package;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.XcoreFactory;

public class Bootstrap {
	
	public static void bootstrap(HbDataStore hbds) {
		
		Package rootPack = XcoreFactory.eINSTANCE.createPackage();
		rootPack.setName("rootPackage");
		rootPack.setPackageGUID("rootPackageGUID");
		
		Package pack = XcoreFactory.eINSTANCE.createPackage();
		pack.setName("package");
		pack.setPackageGUID("packageGUID");
		pack.setParent(rootPack);
		
		Element elePack = XcoreFactory.eINSTANCE.createElement();
		elePack.setName("package");
		elePack.setElementGUID("elementPackageGUID");
		elePack.setPackage(rootPack);
		//ID of corresponding Package
		elePack.setCorrespondingPackage(pack);
		elePack.setType("Package");
		
		rootPack.setCorrespondingElement(elePack);
		pack.setCorrespondingElement(elePack);
		
		Element ele = XcoreFactory.eINSTANCE.createElement();
		ele.setName("element1");
		ele.setElementGUID("element1GUID");
		ele.setPackage(pack);
		ele.setType("Class");
		
		Element ele2 = XcoreFactory.eINSTANCE.createElement();
		ele2.setName("element2");
		ele2.setElementGUID("element2GUID");
		ele2.setPackage(pack);
		ele2.setType("Class");
		
		Attribute att = XcoreFactory.eINSTANCE.createAttribute();
		att.setParent(ele);
		att.setAllowDuplicates(true);
		att.setAttributeGUID("attributeGUID");
		att.setClassifier("0");
		att.setContainer(null);
		att.setNotes("attNotes");
		att.setName("attName");
		
		AttributeConstraint attConst = XcoreFactory.eINSTANCE.createAttributeConstraint();
		attConst.setConstraint("testconstraint");
		attConst.setAttribute(att);
		attConst.setElementOfAttribute(ele);
		
		//composite ID check
		//should fail if not commented
//		AttributeConstraint attConst2 = XcoreFactory.eINSTANCE.createAttributeConstraint();
//		attConst2.setConstraint("testconstraint");
//		attConst2.setAttribute(att);
		
		AttributeTag attTag = XcoreFactory.eINSTANCE.createAttributeTag();
		attTag.setAttribute(att);
		attTag.setName("attTagName");
		attTag.setNotes("attTagNotes");
		attTag.setTagGUID("attTagGuid");
		
		Method method = XcoreFactory.eINSTANCE.createMethod();
		method.setName("method");
		method.setMethodGUID("methodGUID");
		method.setParent(ele2);
		
		Connector connect = XcoreFactory.eINSTANCE.createConnector();
		connect.setType(ConnectorType.CONNECTOR_TYPE.ASSOCIATION);
		connect.setName("connector");
		connect.setConnectorGUID("connectorGUID");
		connect.setSource(ele);
		connect.setSourceCard("1...*");
		connect.setDest(ele2);
		connect.setDestCard("4");
		
		final SessionFactory sessionFac = hbds.getSessionFactory();
		
		Session session = sessionFac.openSession();
		Transaction trans = session.getTransaction();
		
		trans.begin();
		session.save(rootPack);
		trans.commit();
		
		// For setting the right PDATA1 in the element of the second package
//		Query query = session.createQuery("SELECT element FROM Element element WHERE element.Name='package'");
//		List<Element> elements = query.list();
//		System.out.println(""+ elements.get(0).getCorrespondingPackage().getName());
//		System.out.println(""+ elements.get(0).getPackage().getName());
		
	}

}
