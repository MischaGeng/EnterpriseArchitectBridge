/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.xcore;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcoreFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='de.cooperateproject.eabridge.eaobjectmodel'"
 * @generated
 */
public interface XcorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xcore";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "de.cooperateproject.eabridge.eaobjectmodel.xcore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "xcore";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XcorePackage eINSTANCE = de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.AttributeImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Allow Duplicates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ALLOW_DUPLICATES = 0;

	/**
	 * The feature id for the '<em><b>Attribute GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ATTRIBUTE_GUID = 1;

	/**
	 * The feature id for the '<em><b>Attribute ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ATTRIBUTE_ID = 2;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CLASSIFIER = 3;

	/**
	 * The feature id for the '<em><b>Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CONTAINMENT = 5;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CONSTRAINTS = 6;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DEFAULT = 7;

	/**
	 * The feature id for the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_COLLECTION = 8;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_CONST = 9;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_DERIVED = 10;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_ORDERED = 11;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_STATIC = 12;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__LENGTH = 13;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__LOWER_BOUND = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 15;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NOTES = 16;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__PARENT = 17;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__POS = 18;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__PRECISION = 19;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__SCALE = 20;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__STEREOTYPE = 21;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__STYLE = 22;

	/**
	 * The feature id for the '<em><b>Style Ex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__STYLE_EX = 23;

	/**
	 * The feature id for the '<em><b>Tagged Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TAGGED_VALUES = 24;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = 25;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__UPPER_BOUND = 26;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__SCOPE = 27;

	/**
	 * The feature id for the '<em><b>Gen Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__GEN_OPTION = 28;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 29;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.AttributeConstraintImpl <em>Attribute Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.AttributeConstraintImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getAttributeConstraint()
	 * @generated
	 */
	int ATTRIBUTE_CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Element Of Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT__ELEMENT_OF_ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT__ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT__CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Att Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT__ATT_NAME = 3;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT__NOTES = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT__TYPE = 5;

	/**
	 * The number of structural features of the '<em>Attribute Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Attribute Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.AttributeTagImpl <em>Attribute Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.AttributeTagImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getAttributeTag()
	 * @generated
	 */
	int ATTRIBUTE_TAG = 2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TAG__ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TAG__NAME = 1;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TAG__NOTES = 2;

	/**
	 * The feature id for the '<em><b>Tag GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TAG__TAG_GUID = 3;

	/**
	 * The feature id for the '<em><b>Tag ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TAG__TAG_ID = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TAG__VALUE = 5;

	/**
	 * The number of structural features of the '<em>Attribute Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TAG_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Attribute Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TAG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 3;

	/**
	 * The feature id for the '<em><b>Connector ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__CONNECTOR_ID = 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__CONSTRAINTS = 1;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DIRECTION = 2;

	/**
	 * The feature id for the '<em><b>Pt End X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PT_END_X = 3;

	/**
	 * The feature id for the '<em><b>Pt End Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PT_END_Y = 4;

	/**
	 * The feature id for the '<em><b>Event Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__EVENT_FLAGS = 5;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__IS_LEAF = 6;

	/**
	 * The feature id for the '<em><b>Is Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__IS_ROOT = 7;

	/**
	 * The feature id for the '<em><b>Is Spec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__IS_SPEC = 8;

	/**
	 * The feature id for the '<em><b>Meta Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__META_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Misc Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__MISC_DATA = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NAME = 11;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NOTES = 12;

	/**
	 * The feature id for the '<em><b>Route Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__ROUTE_STYLE = 13;

	/**
	 * The feature id for the '<em><b>Seq No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SEQ_NO = 14;

	/**
	 * The feature id for the '<em><b>Pt Start X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PT_START_X = 15;

	/**
	 * The feature id for the '<em><b>Pt Start Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PT_START_Y = 16;

	/**
	 * The feature id for the '<em><b>Action Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__ACTION_FLAGS = 17;

	/**
	 * The feature id for the '<em><b>State Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__STATE_FLAGS = 18;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__STEREOTYPE = 19;

	/**
	 * The feature id for the '<em><b>Style Ex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__STYLE_EX = 20;

	/**
	 * The feature id for the '<em><b>Sub Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SUB_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Tagged Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TAGGED_VALUES = 22;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TYPE = 23;

	/**
	 * The feature id for the '<em><b>Virtual Inheritance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__VIRTUAL_INHERITANCE = 24;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE = 25;

	/**
	 * The feature id for the '<em><b>Dest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DEST = 26;

	/**
	 * The feature id for the '<em><b>Source Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE_CARD = 27;

	/**
	 * The feature id for the '<em><b>Source Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE_ACCESS = 28;

	/**
	 * The feature id for the '<em><b>Source Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE_ELEMENT = 29;

	/**
	 * The feature id for the '<em><b>Source Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE_ROLE = 30;

	/**
	 * The feature id for the '<em><b>Source Role Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE_ROLE_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Source Role Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE_ROLE_NOTE = 32;

	/**
	 * The feature id for the '<em><b>Source Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE_CONTAINMENT = 33;

	/**
	 * The feature id for the '<em><b>Source Is Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE_IS_AGGREGATE = 34;

	/**
	 * The feature id for the '<em><b>Source Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE_IS_ORDERED = 35;

	/**
	 * The feature id for the '<em><b>Source Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE_QUALIFIER = 36;

	/**
	 * The feature id for the '<em><b>Source Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE_CHANGEABLE = 37;

	/**
	 * The feature id for the '<em><b>Source Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE_CONSTRAINT = 38;

	/**
	 * The feature id for the '<em><b>Source Is Navigable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE_IS_NAVIGABLE = 39;

	/**
	 * The feature id for the '<em><b>Source Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE_STEREOTYPE = 40;

	/**
	 * The feature id for the '<em><b>Source Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE_STYLE = 41;

	/**
	 * The feature id for the '<em><b>Source TS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE_TS = 42;

	/**
	 * The feature id for the '<em><b>Dest Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DEST_CARD = 43;

	/**
	 * The feature id for the '<em><b>Dest Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DEST_ACCESS = 44;

	/**
	 * The feature id for the '<em><b>Dest Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DEST_ELEMENT = 45;

	/**
	 * The feature id for the '<em><b>Dest Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DEST_ROLE = 46;

	/**
	 * The feature id for the '<em><b>Dest Role Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DEST_ROLE_TYPE = 47;

	/**
	 * The feature id for the '<em><b>Dest Role Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DEST_ROLE_NOTE = 48;

	/**
	 * The feature id for the '<em><b>Dest Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DEST_CONTAINMENT = 49;

	/**
	 * The feature id for the '<em><b>Dest Is Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DEST_IS_AGGREGATE = 50;

	/**
	 * The feature id for the '<em><b>Dest Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DEST_IS_ORDERED = 51;

	/**
	 * The feature id for the '<em><b>Dest Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DEST_QUALIFIER = 52;

	/**
	 * The feature id for the '<em><b>Dest Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DEST_CHANGEABLE = 53;

	/**
	 * The feature id for the '<em><b>Dest Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DEST_CONSTRAINT = 54;

	/**
	 * The feature id for the '<em><b>Dest Is Navigable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DEST_IS_NAVIGABLE = 55;

	/**
	 * The feature id for the '<em><b>Dest Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DEST_STEREOTYPE = 56;

	/**
	 * The feature id for the '<em><b>Dest Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DEST_STYLE = 57;

	/**
	 * The feature id for the '<em><b>Dest TS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DEST_TS = 58;

	/**
	 * The feature id for the '<em><b>Top Start Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TOP_START_LABEL = 59;

	/**
	 * The feature id for the '<em><b>Top Mid Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TOP_MID_LABEL = 60;

	/**
	 * The feature id for the '<em><b>Top End Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TOP_END_LABEL = 61;

	/**
	 * The feature id for the '<em><b>Btm Start Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__BTM_START_LABEL = 62;

	/**
	 * The feature id for the '<em><b>Btm Mid Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__BTM_MID_LABEL = 63;

	/**
	 * The feature id for the '<em><b>Btm End Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__BTM_END_LABEL = 64;

	/**
	 * The feature id for the '<em><b>Start Edge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__START_EDGE = 65;

	/**
	 * The feature id for the '<em><b>End Edge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__END_EDGE = 66;

	/**
	 * The feature id for the '<em><b>Head Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__HEAD_STYLE = 67;

	/**
	 * The feature id for the '<em><b>Line Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__LINE_STYLE = 68;

	/**
	 * The feature id for the '<em><b>Dispatch Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DISPATCH_ACTION = 69;

	/**
	 * The feature id for the '<em><b>PDATA1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PDATA1 = 70;

	/**
	 * The feature id for the '<em><b>PDATA2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PDATA2 = 71;

	/**
	 * The feature id for the '<em><b>PDATA3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PDATA3 = 72;

	/**
	 * The feature id for the '<em><b>PDATA4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PDATA4 = 73;

	/**
	 * The feature id for the '<em><b>PDATA5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PDATA5 = 74;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = 75;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorConstraintImpl <em>Connector Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorConstraintImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getConnectorConstraint()
	 * @generated
	 */
	int CONNECTOR_CONSTRAINT = 4;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_CONSTRAINT__CONNECTOR = 0;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_CONSTRAINT__CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_CONSTRAINT__NOTES = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_CONSTRAINT__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Connector Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_CONSTRAINT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Connector Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorTagImpl <em>Connector Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorTagImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getConnectorTag()
	 * @generated
	 */
	int CONNECTOR_TAG = 5;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TAG__CONNECTOR = 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TAG__PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TAG__NOTES = 2;

	/**
	 * The feature id for the '<em><b>Tag GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TAG__TAG_GUID = 3;

	/**
	 * The feature id for the '<em><b>Tag ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TAG__TAG_ID = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TAG__VALUE = 5;

	/**
	 * The number of structural features of the '<em>Connector Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TAG_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Connector Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TAG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ABSTRACT = 0;

	/**
	 * The feature id for the '<em><b>Action Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ACTION_FLAGS = 1;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ALIAS = 2;

	/**
	 * The feature id for the '<em><b>Association Class Connector ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ASSOCIATION_CLASS_CONNECTOR_ID = 3;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ATTRIBUTES = 4;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__AUTHOR = 5;

	/**
	 * The feature id for the '<em><b>Base Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__BASE_CLASSES = 6;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CLASSIFIER = 7;

	/**
	 * The feature id for the '<em><b>Classifier Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CLASSIFIER_NAME = 8;

	/**
	 * The feature id for the '<em><b>Classifier Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CLASSIFIER_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Complexity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__COMPLEXITY = 10;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CREATED = 11;

	/**
	 * The feature id for the '<em><b>Difficulty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__DIFFICULTY = 12;

	/**
	 * The feature id for the '<em><b>Element GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ELEMENT_GUID = 13;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ELEMENT_ID = 14;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ELEMENTS = 15;

	/**
	 * The feature id for the '<em><b>Embedded Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__EMBEDDED_ELEMENTS = 16;

	/**
	 * The feature id for the '<em><b>Event Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__EVENT_FLAGS = 17;

	/**
	 * The feature id for the '<em><b>Extension Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__EXTENSION_POINTS = 18;

	/**
	 * The feature id for the '<em><b>Gen File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__GEN_FILE = 19;

	/**
	 * The feature id for the '<em><b>Genlinks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__GENLINKS = 20;

	/**
	 * The feature id for the '<em><b>Gen Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__GEN_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__IS_ACTIVE = 22;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__IS_COMPOSITE = 23;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__IS_LEAF = 24;

	/**
	 * The feature id for the '<em><b>Is New</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__IS_NEW = 25;

	/**
	 * The feature id for the '<em><b>Is Spec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__IS_SPEC = 26;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__LOCKED = 27;

	/**
	 * The feature id for the '<em><b>Meta Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__META_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__METHODS = 29;

	/**
	 * The feature id for the '<em><b>Misc Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__MISC_DATA = 30;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__MODIFIED = 31;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__MULTIPLICITY = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 33;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NOTES = 34;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__PACKAGE = 35;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__PARENT = 36;

	/**
	 * The feature id for the '<em><b>Persistence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__PERSISTENCE = 37;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__PHASE = 38;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__PRIORITY = 39;

	/**
	 * The feature id for the '<em><b>Property Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__PROPERTY_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Property Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__PROPERTY_TYPE_NAME = 41;

	/**
	 * The feature id for the '<em><b>Run State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__RUN_STATE = 42;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__STATUS = 43;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__STEREOTYPE = 44;

	/**
	 * The feature id for the '<em><b>Style Ex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__STYLE_EX = 45;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__SUBTYPE = 46;

	/**
	 * The feature id for the '<em><b>Tablespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TABLESPACE = 47;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TAG = 48;

	/**
	 * The feature id for the '<em><b>Tagged Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TAGGED_VALUES = 49;

	/**
	 * The feature id for the '<em><b>Tree Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TREE_POS = 50;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TYPE = 51;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__VERSION = 52;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__VISIBILITY = 53;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 54;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.MethodImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 7;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__ABSTRACT = 0;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__BEHAVIOUR = 1;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__CLASSIFIER = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__CODE = 3;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__IS_CONST = 4;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__IS_LEAF = 5;

	/**
	 * The feature id for the '<em><b>Is Pure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__IS_PURE = 6;

	/**
	 * The feature id for the '<em><b>Is Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__IS_QUERY = 7;

	/**
	 * The feature id for the '<em><b>Is Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__IS_ROOT = 8;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__IS_STATIC = 9;

	/**
	 * The feature id for the '<em><b>Is Synchronized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__IS_SYNCHRONIZED = 10;

	/**
	 * The feature id for the '<em><b>Method GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__METHOD_GUID = 11;

	/**
	 * The feature id for the '<em><b>Method ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__METHOD_ID = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = 13;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NOTES = 14;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__PARAMETERS = 15;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__PARENT = 16;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__POS = 17;

	/**
	 * The feature id for the '<em><b>Pre Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__PRE_CONDITIONS = 18;

	/**
	 * The feature id for the '<em><b>Post Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__POST_CONDITIONS = 19;

	/**
	 * The feature id for the '<em><b>Return Is Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__RETURN_IS_ARRAY = 20;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__RETURN_TYPE = 21;

	/**
	 * The feature id for the '<em><b>State Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__STATE_FLAGS = 22;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__STEREOTYPE = 23;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__STYLE = 24;

	/**
	 * The feature id for the '<em><b>Style Ex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__STYLE_EX = 25;

	/**
	 * The feature id for the '<em><b>Tagged Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__TAGGED_VALUES = 26;

	/**
	 * The feature id for the '<em><b>Throws</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__THROWS = 27;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__VISIBILITY = 28;

	/**
	 * The feature id for the '<em><b>Concurrency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__CONCURRENCY = 29;

	/**
	 * The feature id for the '<em><b>Gen Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__GEN_OPTION = 30;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = 31;

	/**
	 * The number of operations of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.MethodConstraintImpl <em>Method Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.MethodConstraintImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getMethodConstraint()
	 * @generated
	 */
	int METHOD_CONSTRAINT = 8;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONSTRAINT__NOTES = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONSTRAINT__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Method Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONSTRAINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Method Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.PreConditionImpl <em>Pre Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.PreConditionImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getPreCondition()
	 * @generated
	 */
	int PRE_CONDITION = 9;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITION__NOTES = METHOD_CONSTRAINT__NOTES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITION__TYPE = METHOD_CONSTRAINT__TYPE;

	/**
	 * The feature id for the '<em><b>Method</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITION__METHOD = METHOD_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pre Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITION__PRE_CONDITION = METHOD_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pre Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITION_FEATURE_COUNT = METHOD_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pre Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITION_OPERATION_COUNT = METHOD_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.PostConditionImpl <em>Post Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.PostConditionImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getPostCondition()
	 * @generated
	 */
	int POST_CONDITION = 10;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CONDITION__NOTES = METHOD_CONSTRAINT__NOTES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CONDITION__TYPE = METHOD_CONSTRAINT__TYPE;

	/**
	 * The feature id for the '<em><b>Method</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CONDITION__METHOD = METHOD_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Post Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CONDITION__POST_CONDITION = METHOD_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Post Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CONDITION_FEATURE_COUNT = METHOD_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Post Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CONDITION_OPERATION_COUNT = METHOD_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.MethodTagImpl <em>Method Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.MethodTagImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getMethodTag()
	 * @generated
	 */
	int METHOD_TAG = 11;

	/**
	 * The feature id for the '<em><b>FQ Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TAG__FQ_NAME = 0;

	/**
	 * The feature id for the '<em><b>Method ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TAG__METHOD_ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TAG__NAME = 2;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TAG__NOTES = 3;

	/**
	 * The feature id for the '<em><b>Tag GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TAG__TAG_GUID = 4;

	/**
	 * The feature id for the '<em><b>Tag ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TAG__TAG_ID = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TAG__VALUE = 6;

	/**
	 * The number of structural features of the '<em>Method Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TAG_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Method Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TAG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.PackageImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 12;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ALIAS = 0;

	/**
	 * The feature id for the '<em><b>Batch Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__BATCH_LOAD = 1;

	/**
	 * The feature id for the '<em><b>Batch Save</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__BATCH_SAVE = 2;

	/**
	 * The feature id for the '<em><b>Code Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CODE_PATH = 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CREATED = 4;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ELEMENTS = 6;

	/**
	 * The feature id for the '<em><b>Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__FLAGS = 7;

	/**
	 * The feature id for the '<em><b>Is Controlled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__IS_CONTROLLED = 8;

	/**
	 * The feature id for the '<em><b>Is Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__IS_MODEL = 9;

	/**
	 * The feature id for the '<em><b>Is Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__IS_NAMESPACE = 10;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__IS_PROTECTED = 11;

	/**
	 * The feature id for the '<em><b>Is Version Controlled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__IS_VERSION_CONTROLLED = 12;

	/**
	 * The feature id for the '<em><b>Last Load Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__LAST_LOAD_DATE = 13;

	/**
	 * The feature id for the '<em><b>Last Save Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__LAST_SAVE_DATE = 14;

	/**
	 * The feature id for the '<em><b>Log XML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__LOG_XML = 15;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__MODIFIED = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = 17;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NOTES = 18;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNER = 19;

	/**
	 * The feature id for the '<em><b>Package ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PACKAGE_ID = 20;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PACKAGES = 21;

	/**
	 * The feature id for the '<em><b>Parent ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PARENT_ID = 22;

	/**
	 * The feature id for the '<em><b>Tree Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__TREE_POS = 23;

	/**
	 * The feature id for the '<em><b>UML Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__UML_VERSION = 24;

	/**
	 * The feature id for the '<em><b>Use DTD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__USE_DTD = 25;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__VERSION = 26;

	/**
	 * The feature id for the '<em><b>XML Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__XML_PATH = 27;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = 28;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ParameterImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 13;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ALIAS = 0;

	/**
	 * The feature id for the '<em><b>Classifier ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__CLASSIFIER_ID = 1;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DEFAULT = 2;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__IS_CONST = 3;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__KIND = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 5;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NOTES = 6;

	/**
	 * The feature id for the '<em><b>Operation ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OPERATION_ID = 7;

	/**
	 * The feature id for the '<em><b>Parameter GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PARAMETER_GUID = 8;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__POSITION = 9;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__STEREOTYPE = 10;

	/**
	 * The feature id for the '<em><b>Stereotype Ex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__STEREOTYPE_EX = 11;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__STYLE = 12;

	/**
	 * The feature id for the '<em><b>Style Ex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__STYLE_EX = 13;

	/**
	 * The feature id for the '<em><b>Tagged Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TAGGED_VALUES = 14;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ParamTagImpl <em>Param Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ParamTagImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getParamTag()
	 * @generated
	 */
	int PARAM_TAG = 14;

	/**
	 * The feature id for the '<em><b>Element GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TAG__ELEMENT_GUID = 0;

	/**
	 * The feature id for the '<em><b>FQ Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TAG__FQ_NAME = 1;

	/**
	 * The feature id for the '<em><b>Property GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TAG__PROPERTY_GUID = 2;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TAG__TAG = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TAG__VALUE = 4;

	/**
	 * The number of structural features of the '<em>Param Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TAG_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Param Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TAG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.TaggedValueImpl <em>Tagged Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.TaggedValueImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getTaggedValue()
	 * @generated
	 */
	int TAGGED_VALUE = 15;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE__ELEMENT_ID = 0;

	/**
	 * The feature id for the '<em><b>FQ Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE__FQ_NAME = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE__NOTES = 3;

	/**
	 * The feature id for the '<em><b>Property GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE__PROPERTY_GUID = 4;

	/**
	 * The feature id for the '<em><b>Property ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE__PROPERTY_ID = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE__VALUE = 6;

	/**
	 * The number of structural features of the '<em>Tagged Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Tagged Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.DirectionType <em>Direction Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.DirectionType
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getDirectionType()
	 * @generated
	 */
	int DIRECTION_TYPE = 16;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorType <em>Connector Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorType
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getConnectorType()
	 * @generated
	 */
	int CONNECTOR_TYPE = 17;


	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getAllowDuplicates <em>Allow Duplicates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Duplicates</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getAllowDuplicates()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_AllowDuplicates();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getAttributeGUID <em>Attribute GUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute GUID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getAttributeGUID()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_AttributeGUID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getAttributeID <em>Attribute ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getAttributeID()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_AttributeID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classifier</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getClassifier()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Classifier();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getContainer()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Container();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getContainment <em>Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Containment</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getContainment()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Containment();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getConstraints()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Constraints();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getDefault()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Default();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getIsCollection <em>Is Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Collection</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getIsCollection()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsCollection();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getIsConst <em>Is Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Const</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getIsConst()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsConst();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getIsDerived <em>Is Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Derived</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getIsDerived()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsDerived();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getIsOrdered <em>Is Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Ordered</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getIsOrdered()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsOrdered();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getIsStatic <em>Is Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Static</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getIsStatic()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsStatic();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getLength()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Length();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getLowerBound()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getNotes()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Notes();

	/**
	 * Returns the meta object for the container reference '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getParent()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Parent();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getPos <em>Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getPos()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Pos();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getPrecision()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Precision();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getScale()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Scale();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getStereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stereotype</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getStereotype()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Stereotype();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getStyle()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Style();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getStyleEx <em>Style Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Ex</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getStyleEx()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_StyleEx();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getTaggedValues <em>Tagged Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tagged Values</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getTaggedValues()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_TaggedValues();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getUpperBound()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getScope()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Scope();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getGenOption <em>Gen Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gen Option</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getGenOption()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_GenOption();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeConstraint <em>Attribute Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Constraint</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeConstraint
	 * @generated
	 */
	EClass getAttributeConstraint();

	/**
	 * Returns the meta object for the reference '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeConstraint#getElementOfAttribute <em>Element Of Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element Of Attribute</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeConstraint#getElementOfAttribute()
	 * @see #getAttributeConstraint()
	 * @generated
	 */
	EReference getAttributeConstraint_ElementOfAttribute();

	/**
	 * Returns the meta object for the container reference '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeConstraint#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Attribute</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeConstraint#getAttribute()
	 * @see #getAttributeConstraint()
	 * @generated
	 */
	EReference getAttributeConstraint_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeConstraint#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeConstraint#getConstraint()
	 * @see #getAttributeConstraint()
	 * @generated
	 */
	EAttribute getAttributeConstraint_Constraint();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeConstraint#getAttName <em>Att Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Att Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeConstraint#getAttName()
	 * @see #getAttributeConstraint()
	 * @generated
	 */
	EAttribute getAttributeConstraint_AttName();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeConstraint#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeConstraint#getNotes()
	 * @see #getAttributeConstraint()
	 * @generated
	 */
	EAttribute getAttributeConstraint_Notes();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeConstraint#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeConstraint#getType()
	 * @see #getAttributeConstraint()
	 * @generated
	 */
	EAttribute getAttributeConstraint_Type();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeTag <em>Attribute Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Tag</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeTag
	 * @generated
	 */
	EClass getAttributeTag();

	/**
	 * Returns the meta object for the container reference '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeTag#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Attribute</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeTag#getAttribute()
	 * @see #getAttributeTag()
	 * @generated
	 */
	EReference getAttributeTag_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeTag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeTag#getName()
	 * @see #getAttributeTag()
	 * @generated
	 */
	EAttribute getAttributeTag_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeTag#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeTag#getNotes()
	 * @see #getAttributeTag()
	 * @generated
	 */
	EAttribute getAttributeTag_Notes();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeTag#getTagGUID <em>Tag GUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag GUID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeTag#getTagGUID()
	 * @see #getAttributeTag()
	 * @generated
	 */
	EAttribute getAttributeTag_TagGUID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeTag#getTagID <em>Tag ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeTag#getTagID()
	 * @see #getAttributeTag()
	 * @generated
	 */
	EAttribute getAttributeTag_TagID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeTag#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeTag#getValue()
	 * @see #getAttributeTag()
	 * @generated
	 */
	EAttribute getAttributeTag_Value();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getConnectorID <em>Connector ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connector ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getConnectorID()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_ConnectorID();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getConstraints()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Constraints();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDirection()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Direction();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getPtEndX <em>Pt End X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pt End X</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getPtEndX()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_PtEndX();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getPtEndY <em>Pt End Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pt End Y</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getPtEndY()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_PtEndY();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getEventFlags <em>Event Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Flags</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getEventFlags()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_EventFlags();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getIsLeaf <em>Is Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Leaf</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getIsLeaf()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_IsLeaf();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getIsRoot <em>Is Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Root</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getIsRoot()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_IsRoot();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getIsSpec <em>Is Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Spec</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getIsSpec()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_IsSpec();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getMetaType <em>Meta Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getMetaType()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_MetaType();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getMiscData <em>Misc Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Misc Data</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getMiscData()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_MiscData();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getName()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getNotes()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Notes();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getRouteStyle <em>Route Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Route Style</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getRouteStyle()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_RouteStyle();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSeqNo <em>Seq No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seq No</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSeqNo()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_SeqNo();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getPtStartX <em>Pt Start X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pt Start X</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getPtStartX()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_PtStartX();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getPtStartY <em>Pt Start Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pt Start Y</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getPtStartY()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_PtStartY();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getActionFlags <em>Action Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Flags</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getActionFlags()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_ActionFlags();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getStateFlags <em>State Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Flags</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getStateFlags()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_StateFlags();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getStereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stereotype</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getStereotype()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Stereotype();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getStyleEx <em>Style Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Ex</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getStyleEx()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_StyleEx();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSubType <em>Sub Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSubType()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_SubType();

	/**
	 * Returns the meta object for the containment reference '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getTaggedValues <em>Tagged Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tagged Values</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getTaggedValues()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_TaggedValues();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getType()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getVirtualInheritance <em>Virtual Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Virtual Inheritance</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getVirtualInheritance()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_VirtualInheritance();

	/**
	 * Returns the meta object for the reference '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSource()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Source();

	/**
	 * Returns the meta object for the reference '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDest <em>Dest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dest</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDest()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Dest();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSourceCard <em>Source Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Card</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSourceCard()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_SourceCard();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSourceAccess <em>Source Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Access</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSourceAccess()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_SourceAccess();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSourceElement <em>Source Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Element</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSourceElement()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_SourceElement();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSourceRole <em>Source Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Role</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSourceRole()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_SourceRole();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSourceRoleType <em>Source Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Role Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSourceRoleType()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_SourceRoleType();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSourceRoleNote <em>Source Role Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Role Note</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSourceRoleNote()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_SourceRoleNote();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSourceContainment <em>Source Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Containment</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSourceContainment()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_SourceContainment();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#isSourceIsAggregate <em>Source Is Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Is Aggregate</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#isSourceIsAggregate()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_SourceIsAggregate();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#isSourceIsOrdered <em>Source Is Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Is Ordered</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#isSourceIsOrdered()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_SourceIsOrdered();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSourceQualifier <em>Source Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Qualifier</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSourceQualifier()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_SourceQualifier();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSourceChangeable <em>Source Changeable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Changeable</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSourceChangeable()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_SourceChangeable();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSourceConstraint <em>Source Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Constraint</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSourceConstraint()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_SourceConstraint();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSourceIsNavigable <em>Source Is Navigable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Is Navigable</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSourceIsNavigable()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_SourceIsNavigable();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSourceStereotype <em>Source Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Stereotype</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSourceStereotype()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_SourceStereotype();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSourceStyle <em>Source Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Style</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSourceStyle()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_SourceStyle();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSourceTS <em>Source TS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source TS</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSourceTS()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_SourceTS();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDestCard <em>Dest Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dest Card</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDestCard()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_DestCard();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDestAccess <em>Dest Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dest Access</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDestAccess()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_DestAccess();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDestElement <em>Dest Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dest Element</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDestElement()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_DestElement();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDestRole <em>Dest Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dest Role</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDestRole()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_DestRole();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDestRoleType <em>Dest Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dest Role Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDestRoleType()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_DestRoleType();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDestRoleNote <em>Dest Role Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dest Role Note</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDestRoleNote()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_DestRoleNote();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDestContainment <em>Dest Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dest Containment</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDestContainment()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_DestContainment();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#isDestIsAggregate <em>Dest Is Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dest Is Aggregate</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#isDestIsAggregate()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_DestIsAggregate();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#isDestIsOrdered <em>Dest Is Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dest Is Ordered</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#isDestIsOrdered()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_DestIsOrdered();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDestQualifier <em>Dest Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dest Qualifier</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDestQualifier()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_DestQualifier();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDestChangeable <em>Dest Changeable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dest Changeable</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDestChangeable()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_DestChangeable();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDestConstraint <em>Dest Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dest Constraint</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDestConstraint()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_DestConstraint();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDestIsNavigable <em>Dest Is Navigable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dest Is Navigable</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDestIsNavigable()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_DestIsNavigable();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDestStereotype <em>Dest Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dest Stereotype</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDestStereotype()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_DestStereotype();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDestStyle <em>Dest Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dest Style</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDestStyle()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_DestStyle();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDestTS <em>Dest TS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dest TS</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDestTS()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_DestTS();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getTop_Start_Label <em>Top Start Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top Start Label</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getTop_Start_Label()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Top_Start_Label();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getTop_Mid_Label <em>Top Mid Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top Mid Label</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getTop_Mid_Label()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Top_Mid_Label();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getTop_End_Label <em>Top End Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top End Label</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getTop_End_Label()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Top_End_Label();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getBtm_StartLabel <em>Btm Start Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Btm Start Label</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getBtm_StartLabel()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Btm_StartLabel();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getBtm_MidLabel <em>Btm Mid Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Btm Mid Label</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getBtm_MidLabel()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Btm_MidLabel();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getBtm_EndLabel <em>Btm End Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Btm End Label</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getBtm_EndLabel()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Btm_EndLabel();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getStart_Edge <em>Start Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Edge</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getStart_Edge()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Start_Edge();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getEnd_Edge <em>End Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Edge</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getEnd_Edge()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_End_Edge();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getHeadStyle <em>Head Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Head Style</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getHeadStyle()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_HeadStyle();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getLineStyle <em>Line Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Style</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getLineStyle()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_LineStyle();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDispatchAction <em>Dispatch Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dispatch Action</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDispatchAction()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_DispatchAction();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getPDATA1 <em>PDATA1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PDATA1</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getPDATA1()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_PDATA1();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getPDATA2 <em>PDATA2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PDATA2</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getPDATA2()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_PDATA2();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getPDATA3 <em>PDATA3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PDATA3</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getPDATA3()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_PDATA3();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getPDATA4 <em>PDATA4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PDATA4</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getPDATA4()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_PDATA4();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getPDATA5 <em>PDATA5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PDATA5</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getPDATA5()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_PDATA5();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorConstraint <em>Connector Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Constraint</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorConstraint
	 * @generated
	 */
	EClass getConnectorConstraint();

	/**
	 * Returns the meta object for the container reference '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorConstraint#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Connector</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorConstraint#getConnector()
	 * @see #getConnectorConstraint()
	 * @generated
	 */
	EReference getConnectorConstraint_Connector();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorConstraint#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorConstraint#getConstraint()
	 * @see #getConnectorConstraint()
	 * @generated
	 */
	EAttribute getConnectorConstraint_Constraint();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorConstraint#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorConstraint#getNotes()
	 * @see #getConnectorConstraint()
	 * @generated
	 */
	EAttribute getConnectorConstraint_Notes();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorConstraint#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorConstraint#getType()
	 * @see #getConnectorConstraint()
	 * @generated
	 */
	EAttribute getConnectorConstraint_Type();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorTag <em>Connector Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Tag</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorTag
	 * @generated
	 */
	EClass getConnectorTag();

	/**
	 * Returns the meta object for the container reference '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorTag#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Connector</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorTag#getConnector()
	 * @see #getConnectorTag()
	 * @generated
	 */
	EReference getConnectorTag_Connector();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorTag#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorTag#getProperty()
	 * @see #getConnectorTag()
	 * @generated
	 */
	EAttribute getConnectorTag_Property();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorTag#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorTag#getNotes()
	 * @see #getConnectorTag()
	 * @generated
	 */
	EAttribute getConnectorTag_Notes();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorTag#getTagGUID <em>Tag GUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag GUID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorTag#getTagGUID()
	 * @see #getConnectorTag()
	 * @generated
	 */
	EAttribute getConnectorTag_TagGUID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorTag#getTagID <em>Tag ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorTag#getTagID()
	 * @see #getConnectorTag()
	 * @generated
	 */
	EAttribute getConnectorTag_TagID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorTag#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorTag#getValue()
	 * @see #getConnectorTag()
	 * @generated
	 */
	EAttribute getConnectorTag_Value();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getAbstract()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getActionFlags <em>Action Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Flags</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getActionFlags()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_ActionFlags();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getAlias()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Alias();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getAssociationClassConnectorID <em>Association Class Connector ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Association Class Connector ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getAssociationClassConnectorID()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_AssociationClassConnectorID();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getAttributes()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getAuthor()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Author();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getBaseClasses <em>Base Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Base Classes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getBaseClasses()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_BaseClasses();

	/**
	 * Returns the meta object for the reference '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classifier</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getClassifier()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Classifier();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getClassifierName <em>Classifier Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classifier Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getClassifierName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_ClassifierName();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getClassifierType <em>Classifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classifier Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getClassifierType()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_ClassifierType();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getComplexity <em>Complexity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Complexity</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getComplexity()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Complexity();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getCreated()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Created();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getDifficulty <em>Difficulty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Difficulty</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getDifficulty()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Difficulty();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getElementGUID <em>Element GUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element GUID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getElementGUID()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_ElementGUID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getElementID <em>Element ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getElementID()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_ElementID();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getElements()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Elements();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getEmbeddedElements <em>Embedded Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Embedded Elements</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getEmbeddedElements()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_EmbeddedElements();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getEventFlags <em>Event Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Flags</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getEventFlags()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_EventFlags();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getExtensionPoints <em>Extension Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension Points</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getExtensionPoints()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_ExtensionPoints();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getGenFile <em>Gen File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gen File</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getGenFile()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_GenFile();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getGenlinks <em>Genlinks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Genlinks</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getGenlinks()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Genlinks();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getGenType <em>Gen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gen Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getGenType()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_GenType();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getIsActive <em>Is Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Active</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getIsActive()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_IsActive();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getIsComposite <em>Is Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Composite</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getIsComposite()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_IsComposite();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getIsLeaf <em>Is Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Leaf</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getIsLeaf()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_IsLeaf();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getIsNew <em>Is New</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is New</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getIsNew()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_IsNew();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getIsSpec <em>Is Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Spec</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getIsSpec()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_IsSpec();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getLocked <em>Locked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locked</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getLocked()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Locked();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getMetaType <em>Meta Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getMetaType()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_MetaType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getMethods()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Methods();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getMiscData <em>Misc Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Misc Data</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getMiscData()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_MiscData();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getModified()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Modified();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getMultiplicity()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Multiplicity();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getNotes()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Notes();

	/**
	 * Returns the meta object for the container reference '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Package</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getPackage()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Package();

	/**
	 * Returns the meta object for the reference '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getParent()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Parent();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getPersistence <em>Persistence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistence</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getPersistence()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Persistence();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getPhase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getPhase()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Phase();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getPriority()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Priority();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getPropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getPropertyType()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_PropertyType();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getPropertyTypeName <em>Property Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Type Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getPropertyTypeName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_PropertyTypeName();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getRunState <em>Run State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Run State</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getRunState()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_RunState();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getStatus()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Status();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getStereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stereotype</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getStereotype()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Stereotype();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getStyleEx <em>Style Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Ex</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getStyleEx()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_StyleEx();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getSubtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subtype</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getSubtype()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Subtype();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getTablespace <em>Tablespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tablespace</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getTablespace()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Tablespace();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getTag()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Tag();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getTaggedValues <em>Tagged Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tagged Values</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getTaggedValues()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_TaggedValues();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getTreePos <em>Tree Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tree Pos</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getTreePos()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_TreePos();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getType()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getVersion()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Version();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getVisibility()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Visibility();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getAbstract()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getBehaviour <em>Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Behaviour</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getBehaviour()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Behaviour();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classifier</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getClassifier()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Classifier();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getCode()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Code();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getIsConst <em>Is Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Const</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getIsConst()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_IsConst();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getIsLeaf <em>Is Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Leaf</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getIsLeaf()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_IsLeaf();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getIsPure <em>Is Pure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Pure</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getIsPure()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_IsPure();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getIsQuery <em>Is Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Query</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getIsQuery()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_IsQuery();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getIsRoot <em>Is Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Root</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getIsRoot()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_IsRoot();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getIsStatic <em>Is Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Static</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getIsStatic()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_IsStatic();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getIsSynchronized <em>Is Synchronized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Synchronized</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getIsSynchronized()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_IsSynchronized();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getMethodGUID <em>Method GUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method GUID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getMethodGUID()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_MethodGUID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getMethodID <em>Method ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getMethodID()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_MethodID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getName()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getNotes()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Notes();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getParameters()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Parameters();

	/**
	 * Returns the meta object for the container reference '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getParent()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Parent();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getPos <em>Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getPos()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Pos();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getPreConditions <em>Pre Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre Conditions</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getPreConditions()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_PreConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getPostConditions <em>Post Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Post Conditions</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getPostConditions()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_PostConditions();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getReturnIsArray <em>Return Is Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Is Array</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getReturnIsArray()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_ReturnIsArray();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getReturnType()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_ReturnType();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getStateFlags <em>State Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Flags</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getStateFlags()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_StateFlags();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getStereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stereotype</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getStereotype()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Stereotype();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getStyle()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Style();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getStyleEx <em>Style Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Ex</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getStyleEx()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_StyleEx();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getTaggedValues <em>Tagged Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tagged Values</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getTaggedValues()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_TaggedValues();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getThrows <em>Throws</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throws</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getThrows()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Throws();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getVisibility()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getConcurrency <em>Concurrency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concurrency</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getConcurrency()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Concurrency();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getGenOption <em>Gen Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gen Option</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getGenOption()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_GenOption();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodConstraint <em>Method Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Constraint</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodConstraint
	 * @generated
	 */
	EClass getMethodConstraint();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodConstraint#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodConstraint#getNotes()
	 * @see #getMethodConstraint()
	 * @generated
	 */
	EAttribute getMethodConstraint_Notes();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodConstraint#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodConstraint#getType()
	 * @see #getMethodConstraint()
	 * @generated
	 */
	EAttribute getMethodConstraint_Type();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.PreCondition <em>Pre Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Condition</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.PreCondition
	 * @generated
	 */
	EClass getPreCondition();

	/**
	 * Returns the meta object for the container reference '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.PreCondition#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Method</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.PreCondition#getMethod()
	 * @see #getPreCondition()
	 * @generated
	 */
	EReference getPreCondition_Method();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.PreCondition#getPreCondition <em>Pre Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pre Condition</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.PreCondition#getPreCondition()
	 * @see #getPreCondition()
	 * @generated
	 */
	EAttribute getPreCondition_PreCondition();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.PostCondition <em>Post Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Condition</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.PostCondition
	 * @generated
	 */
	EClass getPostCondition();

	/**
	 * Returns the meta object for the container reference '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.PostCondition#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Method</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.PostCondition#getMethod()
	 * @see #getPostCondition()
	 * @generated
	 */
	EReference getPostCondition_Method();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.PostCondition#getPostCondition <em>Post Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Post Condition</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.PostCondition#getPostCondition()
	 * @see #getPostCondition()
	 * @generated
	 */
	EAttribute getPostCondition_PostCondition();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodTag <em>Method Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Tag</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodTag
	 * @generated
	 */
	EClass getMethodTag();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodTag#getFQName <em>FQ Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FQ Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodTag#getFQName()
	 * @see #getMethodTag()
	 * @generated
	 */
	EAttribute getMethodTag_FQName();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodTag#getMethodID <em>Method ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodTag#getMethodID()
	 * @see #getMethodTag()
	 * @generated
	 */
	EAttribute getMethodTag_MethodID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodTag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodTag#getName()
	 * @see #getMethodTag()
	 * @generated
	 */
	EAttribute getMethodTag_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodTag#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodTag#getNotes()
	 * @see #getMethodTag()
	 * @generated
	 */
	EAttribute getMethodTag_Notes();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodTag#getTagGUID <em>Tag GUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag GUID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodTag#getTagGUID()
	 * @see #getMethodTag()
	 * @generated
	 */
	EAttribute getMethodTag_TagGUID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodTag#getTagID <em>Tag ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodTag#getTagID()
	 * @see #getMethodTag()
	 * @generated
	 */
	EAttribute getMethodTag_TagID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodTag#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodTag#getValue()
	 * @see #getMethodTag()
	 * @generated
	 */
	EAttribute getMethodTag_Value();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getAlias()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Alias();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getBatchLoad <em>Batch Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Batch Load</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getBatchLoad()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_BatchLoad();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getBatchSave <em>Batch Save</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Batch Save</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getBatchSave()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_BatchSave();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getCodePath <em>Code Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code Path</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getCodePath()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_CodePath();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getCreated()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Created();

	/**
	 * Returns the meta object for the containment reference '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getElement()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Element();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getElements()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Elements();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getFlags <em>Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flags</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getFlags()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Flags();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getIsControlled <em>Is Controlled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Controlled</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getIsControlled()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_IsControlled();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getIsModel <em>Is Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Model</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getIsModel()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_IsModel();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getIsNamespace <em>Is Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Namespace</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getIsNamespace()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_IsNamespace();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getIsProtected <em>Is Protected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Protected</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getIsProtected()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_IsProtected();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getIsVersionControlled <em>Is Version Controlled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Version Controlled</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getIsVersionControlled()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_IsVersionControlled();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getLastLoadDate <em>Last Load Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Load Date</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getLastLoadDate()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_LastLoadDate();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getLastSaveDate <em>Last Save Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Save Date</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getLastSaveDate()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_LastSaveDate();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getLogXML <em>Log XML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log XML</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getLogXML()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_LogXML();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getModified()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Modified();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getName()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getNotes()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Notes();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getOwner()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Owner();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getPackageID <em>Package ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getPackageID()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_PackageID();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getPackages()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Packages();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getParentID <em>Parent ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getParentID()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_ParentID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getTreePos <em>Tree Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tree Pos</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getTreePos()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_TreePos();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getUMLVersion <em>UML Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>UML Version</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getUMLVersion()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_UMLVersion();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getUseDTD <em>Use DTD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use DTD</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getUseDTD()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_UseDTD();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getVersion()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Version();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getXMLPath <em>XML Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XML Path</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getXMLPath()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_XMLPath();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getAlias()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Alias();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getClassifierID <em>Classifier ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classifier ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getClassifierID()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_ClassifierID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getDefault()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Default();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getIsConst <em>Is Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Const</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getIsConst()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_IsConst();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getKind()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Kind();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getNotes()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Notes();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getOperationID <em>Operation ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getOperationID()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_OperationID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getParameterGUID <em>Parameter GUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter GUID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getParameterGUID()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_ParameterGUID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getPosition()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Position();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getStereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stereotype</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getStereotype()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Stereotype();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getStereotypeEx <em>Stereotype Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stereotype Ex</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getStereotypeEx()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_StereotypeEx();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getStyle()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Style();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getStyleEx <em>Style Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Ex</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getStyleEx()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_StyleEx();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getTaggedValues <em>Tagged Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tagged Values</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getTaggedValues()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_TaggedValues();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ParamTag <em>Param Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param Tag</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ParamTag
	 * @generated
	 */
	EClass getParamTag();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ParamTag#getElementGUID <em>Element GUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element GUID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ParamTag#getElementGUID()
	 * @see #getParamTag()
	 * @generated
	 */
	EAttribute getParamTag_ElementGUID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ParamTag#getFQName <em>FQ Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FQ Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ParamTag#getFQName()
	 * @see #getParamTag()
	 * @generated
	 */
	EAttribute getParamTag_FQName();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ParamTag#getPropertyGUID <em>Property GUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property GUID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ParamTag#getPropertyGUID()
	 * @see #getParamTag()
	 * @generated
	 */
	EAttribute getParamTag_PropertyGUID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ParamTag#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ParamTag#getTag()
	 * @see #getParamTag()
	 * @generated
	 */
	EAttribute getParamTag_Tag();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ParamTag#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ParamTag#getValue()
	 * @see #getParamTag()
	 * @generated
	 */
	EAttribute getParamTag_Value();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.TaggedValue <em>Tagged Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tagged Value</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.TaggedValue
	 * @generated
	 */
	EClass getTaggedValue();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.TaggedValue#getElementID <em>Element ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.TaggedValue#getElementID()
	 * @see #getTaggedValue()
	 * @generated
	 */
	EAttribute getTaggedValue_ElementID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.TaggedValue#getFQName <em>FQ Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FQ Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.TaggedValue#getFQName()
	 * @see #getTaggedValue()
	 * @generated
	 */
	EAttribute getTaggedValue_FQName();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.TaggedValue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.TaggedValue#getName()
	 * @see #getTaggedValue()
	 * @generated
	 */
	EAttribute getTaggedValue_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.TaggedValue#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.TaggedValue#getNotes()
	 * @see #getTaggedValue()
	 * @generated
	 */
	EAttribute getTaggedValue_Notes();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.TaggedValue#getPropertyGUID <em>Property GUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property GUID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.TaggedValue#getPropertyGUID()
	 * @see #getTaggedValue()
	 * @generated
	 */
	EAttribute getTaggedValue_PropertyGUID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.TaggedValue#getPropertyID <em>Property ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.TaggedValue#getPropertyID()
	 * @see #getTaggedValue()
	 * @generated
	 */
	EAttribute getTaggedValue_PropertyID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.TaggedValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.TaggedValue#getValue()
	 * @see #getTaggedValue()
	 * @generated
	 */
	EAttribute getTaggedValue_Value();

	/**
	 * Returns the meta object for enum '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.DirectionType <em>Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.DirectionType
	 * @generated
	 */
	EEnum getDirectionType();

	/**
	 * Returns the meta object for enum '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorType <em>Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Connector Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorType
	 * @generated
	 */
	EEnum getConnectorType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XcoreFactory getXcoreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.AttributeImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Allow Duplicates</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__ALLOW_DUPLICATES = eINSTANCE.getAttribute_AllowDuplicates();

		/**
		 * The meta object literal for the '<em><b>Attribute GUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__ATTRIBUTE_GUID = eINSTANCE.getAttribute_AttributeGUID();

		/**
		 * The meta object literal for the '<em><b>Attribute ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__ATTRIBUTE_ID = eINSTANCE.getAttribute_AttributeID();

		/**
		 * The meta object literal for the '<em><b>Classifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__CLASSIFIER = eINSTANCE.getAttribute_Classifier();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__CONTAINER = eINSTANCE.getAttribute_Container();

		/**
		 * The meta object literal for the '<em><b>Containment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__CONTAINMENT = eINSTANCE.getAttribute_Containment();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__CONSTRAINTS = eINSTANCE.getAttribute_Constraints();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__DEFAULT = eINSTANCE.getAttribute_Default();

		/**
		 * The meta object literal for the '<em><b>Is Collection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IS_COLLECTION = eINSTANCE.getAttribute_IsCollection();

		/**
		 * The meta object literal for the '<em><b>Is Const</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IS_CONST = eINSTANCE.getAttribute_IsConst();

		/**
		 * The meta object literal for the '<em><b>Is Derived</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IS_DERIVED = eINSTANCE.getAttribute_IsDerived();

		/**
		 * The meta object literal for the '<em><b>Is Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IS_ORDERED = eINSTANCE.getAttribute_IsOrdered();

		/**
		 * The meta object literal for the '<em><b>Is Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IS_STATIC = eINSTANCE.getAttribute_IsStatic();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__LENGTH = eINSTANCE.getAttribute_Length();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__LOWER_BOUND = eINSTANCE.getAttribute_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NOTES = eINSTANCE.getAttribute_Notes();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__PARENT = eINSTANCE.getAttribute_Parent();

		/**
		 * The meta object literal for the '<em><b>Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__POS = eINSTANCE.getAttribute_Pos();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__PRECISION = eINSTANCE.getAttribute_Precision();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__SCALE = eINSTANCE.getAttribute_Scale();

		/**
		 * The meta object literal for the '<em><b>Stereotype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__STEREOTYPE = eINSTANCE.getAttribute_Stereotype();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__STYLE = eINSTANCE.getAttribute_Style();

		/**
		 * The meta object literal for the '<em><b>Style Ex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__STYLE_EX = eINSTANCE.getAttribute_StyleEx();

		/**
		 * The meta object literal for the '<em><b>Tagged Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__TAGGED_VALUES = eINSTANCE.getAttribute_TaggedValues();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__UPPER_BOUND = eINSTANCE.getAttribute_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__SCOPE = eINSTANCE.getAttribute_Scope();

		/**
		 * The meta object literal for the '<em><b>Gen Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__GEN_OPTION = eINSTANCE.getAttribute_GenOption();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.AttributeConstraintImpl <em>Attribute Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.AttributeConstraintImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getAttributeConstraint()
		 * @generated
		 */
		EClass ATTRIBUTE_CONSTRAINT = eINSTANCE.getAttributeConstraint();

		/**
		 * The meta object literal for the '<em><b>Element Of Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_CONSTRAINT__ELEMENT_OF_ATTRIBUTE = eINSTANCE.getAttributeConstraint_ElementOfAttribute();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_CONSTRAINT__ATTRIBUTE = eINSTANCE.getAttributeConstraint_Attribute();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_CONSTRAINT__CONSTRAINT = eINSTANCE.getAttributeConstraint_Constraint();

		/**
		 * The meta object literal for the '<em><b>Att Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_CONSTRAINT__ATT_NAME = eINSTANCE.getAttributeConstraint_AttName();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_CONSTRAINT__NOTES = eINSTANCE.getAttributeConstraint_Notes();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_CONSTRAINT__TYPE = eINSTANCE.getAttributeConstraint_Type();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.AttributeTagImpl <em>Attribute Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.AttributeTagImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getAttributeTag()
		 * @generated
		 */
		EClass ATTRIBUTE_TAG = eINSTANCE.getAttributeTag();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_TAG__ATTRIBUTE = eINSTANCE.getAttributeTag_Attribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_TAG__NAME = eINSTANCE.getAttributeTag_Name();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_TAG__NOTES = eINSTANCE.getAttributeTag_Notes();

		/**
		 * The meta object literal for the '<em><b>Tag GUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_TAG__TAG_GUID = eINSTANCE.getAttributeTag_TagGUID();

		/**
		 * The meta object literal for the '<em><b>Tag ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_TAG__TAG_ID = eINSTANCE.getAttributeTag_TagID();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_TAG__VALUE = eINSTANCE.getAttributeTag_Value();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Connector ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__CONNECTOR_ID = eINSTANCE.getConnector_ConnectorID();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__CONSTRAINTS = eINSTANCE.getConnector_Constraints();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__DIRECTION = eINSTANCE.getConnector_Direction();

		/**
		 * The meta object literal for the '<em><b>Pt End X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__PT_END_X = eINSTANCE.getConnector_PtEndX();

		/**
		 * The meta object literal for the '<em><b>Pt End Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__PT_END_Y = eINSTANCE.getConnector_PtEndY();

		/**
		 * The meta object literal for the '<em><b>Event Flags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__EVENT_FLAGS = eINSTANCE.getConnector_EventFlags();

		/**
		 * The meta object literal for the '<em><b>Is Leaf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__IS_LEAF = eINSTANCE.getConnector_IsLeaf();

		/**
		 * The meta object literal for the '<em><b>Is Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__IS_ROOT = eINSTANCE.getConnector_IsRoot();

		/**
		 * The meta object literal for the '<em><b>Is Spec</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__IS_SPEC = eINSTANCE.getConnector_IsSpec();

		/**
		 * The meta object literal for the '<em><b>Meta Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__META_TYPE = eINSTANCE.getConnector_MetaType();

		/**
		 * The meta object literal for the '<em><b>Misc Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__MISC_DATA = eINSTANCE.getConnector_MiscData();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__NAME = eINSTANCE.getConnector_Name();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__NOTES = eINSTANCE.getConnector_Notes();

		/**
		 * The meta object literal for the '<em><b>Route Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__ROUTE_STYLE = eINSTANCE.getConnector_RouteStyle();

		/**
		 * The meta object literal for the '<em><b>Seq No</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__SEQ_NO = eINSTANCE.getConnector_SeqNo();

		/**
		 * The meta object literal for the '<em><b>Pt Start X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__PT_START_X = eINSTANCE.getConnector_PtStartX();

		/**
		 * The meta object literal for the '<em><b>Pt Start Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__PT_START_Y = eINSTANCE.getConnector_PtStartY();

		/**
		 * The meta object literal for the '<em><b>Action Flags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__ACTION_FLAGS = eINSTANCE.getConnector_ActionFlags();

		/**
		 * The meta object literal for the '<em><b>State Flags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__STATE_FLAGS = eINSTANCE.getConnector_StateFlags();

		/**
		 * The meta object literal for the '<em><b>Stereotype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__STEREOTYPE = eINSTANCE.getConnector_Stereotype();

		/**
		 * The meta object literal for the '<em><b>Style Ex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__STYLE_EX = eINSTANCE.getConnector_StyleEx();

		/**
		 * The meta object literal for the '<em><b>Sub Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__SUB_TYPE = eINSTANCE.getConnector_SubType();

		/**
		 * The meta object literal for the '<em><b>Tagged Values</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__TAGGED_VALUES = eINSTANCE.getConnector_TaggedValues();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__TYPE = eINSTANCE.getConnector_Type();

		/**
		 * The meta object literal for the '<em><b>Virtual Inheritance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__VIRTUAL_INHERITANCE = eINSTANCE.getConnector_VirtualInheritance();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__SOURCE = eINSTANCE.getConnector_Source();

		/**
		 * The meta object literal for the '<em><b>Dest</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__DEST = eINSTANCE.getConnector_Dest();

		/**
		 * The meta object literal for the '<em><b>Source Card</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__SOURCE_CARD = eINSTANCE.getConnector_SourceCard();

		/**
		 * The meta object literal for the '<em><b>Source Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__SOURCE_ACCESS = eINSTANCE.getConnector_SourceAccess();

		/**
		 * The meta object literal for the '<em><b>Source Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__SOURCE_ELEMENT = eINSTANCE.getConnector_SourceElement();

		/**
		 * The meta object literal for the '<em><b>Source Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__SOURCE_ROLE = eINSTANCE.getConnector_SourceRole();

		/**
		 * The meta object literal for the '<em><b>Source Role Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__SOURCE_ROLE_TYPE = eINSTANCE.getConnector_SourceRoleType();

		/**
		 * The meta object literal for the '<em><b>Source Role Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__SOURCE_ROLE_NOTE = eINSTANCE.getConnector_SourceRoleNote();

		/**
		 * The meta object literal for the '<em><b>Source Containment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__SOURCE_CONTAINMENT = eINSTANCE.getConnector_SourceContainment();

		/**
		 * The meta object literal for the '<em><b>Source Is Aggregate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__SOURCE_IS_AGGREGATE = eINSTANCE.getConnector_SourceIsAggregate();

		/**
		 * The meta object literal for the '<em><b>Source Is Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__SOURCE_IS_ORDERED = eINSTANCE.getConnector_SourceIsOrdered();

		/**
		 * The meta object literal for the '<em><b>Source Qualifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__SOURCE_QUALIFIER = eINSTANCE.getConnector_SourceQualifier();

		/**
		 * The meta object literal for the '<em><b>Source Changeable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__SOURCE_CHANGEABLE = eINSTANCE.getConnector_SourceChangeable();

		/**
		 * The meta object literal for the '<em><b>Source Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__SOURCE_CONSTRAINT = eINSTANCE.getConnector_SourceConstraint();

		/**
		 * The meta object literal for the '<em><b>Source Is Navigable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__SOURCE_IS_NAVIGABLE = eINSTANCE.getConnector_SourceIsNavigable();

		/**
		 * The meta object literal for the '<em><b>Source Stereotype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__SOURCE_STEREOTYPE = eINSTANCE.getConnector_SourceStereotype();

		/**
		 * The meta object literal for the '<em><b>Source Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__SOURCE_STYLE = eINSTANCE.getConnector_SourceStyle();

		/**
		 * The meta object literal for the '<em><b>Source TS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__SOURCE_TS = eINSTANCE.getConnector_SourceTS();

		/**
		 * The meta object literal for the '<em><b>Dest Card</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__DEST_CARD = eINSTANCE.getConnector_DestCard();

		/**
		 * The meta object literal for the '<em><b>Dest Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__DEST_ACCESS = eINSTANCE.getConnector_DestAccess();

		/**
		 * The meta object literal for the '<em><b>Dest Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__DEST_ELEMENT = eINSTANCE.getConnector_DestElement();

		/**
		 * The meta object literal for the '<em><b>Dest Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__DEST_ROLE = eINSTANCE.getConnector_DestRole();

		/**
		 * The meta object literal for the '<em><b>Dest Role Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__DEST_ROLE_TYPE = eINSTANCE.getConnector_DestRoleType();

		/**
		 * The meta object literal for the '<em><b>Dest Role Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__DEST_ROLE_NOTE = eINSTANCE.getConnector_DestRoleNote();

		/**
		 * The meta object literal for the '<em><b>Dest Containment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__DEST_CONTAINMENT = eINSTANCE.getConnector_DestContainment();

		/**
		 * The meta object literal for the '<em><b>Dest Is Aggregate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__DEST_IS_AGGREGATE = eINSTANCE.getConnector_DestIsAggregate();

		/**
		 * The meta object literal for the '<em><b>Dest Is Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__DEST_IS_ORDERED = eINSTANCE.getConnector_DestIsOrdered();

		/**
		 * The meta object literal for the '<em><b>Dest Qualifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__DEST_QUALIFIER = eINSTANCE.getConnector_DestQualifier();

		/**
		 * The meta object literal for the '<em><b>Dest Changeable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__DEST_CHANGEABLE = eINSTANCE.getConnector_DestChangeable();

		/**
		 * The meta object literal for the '<em><b>Dest Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__DEST_CONSTRAINT = eINSTANCE.getConnector_DestConstraint();

		/**
		 * The meta object literal for the '<em><b>Dest Is Navigable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__DEST_IS_NAVIGABLE = eINSTANCE.getConnector_DestIsNavigable();

		/**
		 * The meta object literal for the '<em><b>Dest Stereotype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__DEST_STEREOTYPE = eINSTANCE.getConnector_DestStereotype();

		/**
		 * The meta object literal for the '<em><b>Dest Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__DEST_STYLE = eINSTANCE.getConnector_DestStyle();

		/**
		 * The meta object literal for the '<em><b>Dest TS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__DEST_TS = eINSTANCE.getConnector_DestTS();

		/**
		 * The meta object literal for the '<em><b>Top Start Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__TOP_START_LABEL = eINSTANCE.getConnector_Top_Start_Label();

		/**
		 * The meta object literal for the '<em><b>Top Mid Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__TOP_MID_LABEL = eINSTANCE.getConnector_Top_Mid_Label();

		/**
		 * The meta object literal for the '<em><b>Top End Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__TOP_END_LABEL = eINSTANCE.getConnector_Top_End_Label();

		/**
		 * The meta object literal for the '<em><b>Btm Start Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__BTM_START_LABEL = eINSTANCE.getConnector_Btm_StartLabel();

		/**
		 * The meta object literal for the '<em><b>Btm Mid Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__BTM_MID_LABEL = eINSTANCE.getConnector_Btm_MidLabel();

		/**
		 * The meta object literal for the '<em><b>Btm End Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__BTM_END_LABEL = eINSTANCE.getConnector_Btm_EndLabel();

		/**
		 * The meta object literal for the '<em><b>Start Edge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__START_EDGE = eINSTANCE.getConnector_Start_Edge();

		/**
		 * The meta object literal for the '<em><b>End Edge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__END_EDGE = eINSTANCE.getConnector_End_Edge();

		/**
		 * The meta object literal for the '<em><b>Head Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__HEAD_STYLE = eINSTANCE.getConnector_HeadStyle();

		/**
		 * The meta object literal for the '<em><b>Line Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__LINE_STYLE = eINSTANCE.getConnector_LineStyle();

		/**
		 * The meta object literal for the '<em><b>Dispatch Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__DISPATCH_ACTION = eINSTANCE.getConnector_DispatchAction();

		/**
		 * The meta object literal for the '<em><b>PDATA1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__PDATA1 = eINSTANCE.getConnector_PDATA1();

		/**
		 * The meta object literal for the '<em><b>PDATA2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__PDATA2 = eINSTANCE.getConnector_PDATA2();

		/**
		 * The meta object literal for the '<em><b>PDATA3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__PDATA3 = eINSTANCE.getConnector_PDATA3();

		/**
		 * The meta object literal for the '<em><b>PDATA4</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__PDATA4 = eINSTANCE.getConnector_PDATA4();

		/**
		 * The meta object literal for the '<em><b>PDATA5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__PDATA5 = eINSTANCE.getConnector_PDATA5();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorConstraintImpl <em>Connector Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorConstraintImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getConnectorConstraint()
		 * @generated
		 */
		EClass CONNECTOR_CONSTRAINT = eINSTANCE.getConnectorConstraint();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_CONSTRAINT__CONNECTOR = eINSTANCE.getConnectorConstraint_Connector();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_CONSTRAINT__CONSTRAINT = eINSTANCE.getConnectorConstraint_Constraint();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_CONSTRAINT__NOTES = eINSTANCE.getConnectorConstraint_Notes();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_CONSTRAINT__TYPE = eINSTANCE.getConnectorConstraint_Type();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorTagImpl <em>Connector Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorTagImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getConnectorTag()
		 * @generated
		 */
		EClass CONNECTOR_TAG = eINSTANCE.getConnectorTag();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_TAG__CONNECTOR = eINSTANCE.getConnectorTag_Connector();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_TAG__PROPERTY = eINSTANCE.getConnectorTag_Property();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_TAG__NOTES = eINSTANCE.getConnectorTag_Notes();

		/**
		 * The meta object literal for the '<em><b>Tag GUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_TAG__TAG_GUID = eINSTANCE.getConnectorTag_TagGUID();

		/**
		 * The meta object literal for the '<em><b>Tag ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_TAG__TAG_ID = eINSTANCE.getConnectorTag_TagID();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_TAG__VALUE = eINSTANCE.getConnectorTag_Value();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__ABSTRACT = eINSTANCE.getElement_Abstract();

		/**
		 * The meta object literal for the '<em><b>Action Flags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__ACTION_FLAGS = eINSTANCE.getElement_ActionFlags();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__ALIAS = eINSTANCE.getElement_Alias();

		/**
		 * The meta object literal for the '<em><b>Association Class Connector ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__ASSOCIATION_CLASS_CONNECTOR_ID = eINSTANCE.getElement_AssociationClassConnectorID();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__ATTRIBUTES = eINSTANCE.getElement_Attributes();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__AUTHOR = eINSTANCE.getElement_Author();

		/**
		 * The meta object literal for the '<em><b>Base Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__BASE_CLASSES = eINSTANCE.getElement_BaseClasses();

		/**
		 * The meta object literal for the '<em><b>Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__CLASSIFIER = eINSTANCE.getElement_Classifier();

		/**
		 * The meta object literal for the '<em><b>Classifier Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__CLASSIFIER_NAME = eINSTANCE.getElement_ClassifierName();

		/**
		 * The meta object literal for the '<em><b>Classifier Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__CLASSIFIER_TYPE = eINSTANCE.getElement_ClassifierType();

		/**
		 * The meta object literal for the '<em><b>Complexity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__COMPLEXITY = eINSTANCE.getElement_Complexity();

		/**
		 * The meta object literal for the '<em><b>Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__CREATED = eINSTANCE.getElement_Created();

		/**
		 * The meta object literal for the '<em><b>Difficulty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__DIFFICULTY = eINSTANCE.getElement_Difficulty();

		/**
		 * The meta object literal for the '<em><b>Element GUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__ELEMENT_GUID = eINSTANCE.getElement_ElementGUID();

		/**
		 * The meta object literal for the '<em><b>Element ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__ELEMENT_ID = eINSTANCE.getElement_ElementID();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__ELEMENTS = eINSTANCE.getElement_Elements();

		/**
		 * The meta object literal for the '<em><b>Embedded Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__EMBEDDED_ELEMENTS = eINSTANCE.getElement_EmbeddedElements();

		/**
		 * The meta object literal for the '<em><b>Event Flags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__EVENT_FLAGS = eINSTANCE.getElement_EventFlags();

		/**
		 * The meta object literal for the '<em><b>Extension Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__EXTENSION_POINTS = eINSTANCE.getElement_ExtensionPoints();

		/**
		 * The meta object literal for the '<em><b>Gen File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__GEN_FILE = eINSTANCE.getElement_GenFile();

		/**
		 * The meta object literal for the '<em><b>Genlinks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__GENLINKS = eINSTANCE.getElement_Genlinks();

		/**
		 * The meta object literal for the '<em><b>Gen Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__GEN_TYPE = eINSTANCE.getElement_GenType();

		/**
		 * The meta object literal for the '<em><b>Is Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__IS_ACTIVE = eINSTANCE.getElement_IsActive();

		/**
		 * The meta object literal for the '<em><b>Is Composite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__IS_COMPOSITE = eINSTANCE.getElement_IsComposite();

		/**
		 * The meta object literal for the '<em><b>Is Leaf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__IS_LEAF = eINSTANCE.getElement_IsLeaf();

		/**
		 * The meta object literal for the '<em><b>Is New</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__IS_NEW = eINSTANCE.getElement_IsNew();

		/**
		 * The meta object literal for the '<em><b>Is Spec</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__IS_SPEC = eINSTANCE.getElement_IsSpec();

		/**
		 * The meta object literal for the '<em><b>Locked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__LOCKED = eINSTANCE.getElement_Locked();

		/**
		 * The meta object literal for the '<em><b>Meta Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__META_TYPE = eINSTANCE.getElement_MetaType();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__METHODS = eINSTANCE.getElement_Methods();

		/**
		 * The meta object literal for the '<em><b>Misc Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__MISC_DATA = eINSTANCE.getElement_MiscData();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__MODIFIED = eINSTANCE.getElement_Modified();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__MULTIPLICITY = eINSTANCE.getElement_Multiplicity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NOTES = eINSTANCE.getElement_Notes();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__PACKAGE = eINSTANCE.getElement_Package();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__PARENT = eINSTANCE.getElement_Parent();

		/**
		 * The meta object literal for the '<em><b>Persistence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__PERSISTENCE = eINSTANCE.getElement_Persistence();

		/**
		 * The meta object literal for the '<em><b>Phase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__PHASE = eINSTANCE.getElement_Phase();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__PRIORITY = eINSTANCE.getElement_Priority();

		/**
		 * The meta object literal for the '<em><b>Property Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__PROPERTY_TYPE = eINSTANCE.getElement_PropertyType();

		/**
		 * The meta object literal for the '<em><b>Property Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__PROPERTY_TYPE_NAME = eINSTANCE.getElement_PropertyTypeName();

		/**
		 * The meta object literal for the '<em><b>Run State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__RUN_STATE = eINSTANCE.getElement_RunState();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__STATUS = eINSTANCE.getElement_Status();

		/**
		 * The meta object literal for the '<em><b>Stereotype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__STEREOTYPE = eINSTANCE.getElement_Stereotype();

		/**
		 * The meta object literal for the '<em><b>Style Ex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__STYLE_EX = eINSTANCE.getElement_StyleEx();

		/**
		 * The meta object literal for the '<em><b>Subtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__SUBTYPE = eINSTANCE.getElement_Subtype();

		/**
		 * The meta object literal for the '<em><b>Tablespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__TABLESPACE = eINSTANCE.getElement_Tablespace();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__TAG = eINSTANCE.getElement_Tag();

		/**
		 * The meta object literal for the '<em><b>Tagged Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__TAGGED_VALUES = eINSTANCE.getElement_TaggedValues();

		/**
		 * The meta object literal for the '<em><b>Tree Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__TREE_POS = eINSTANCE.getElement_TreePos();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__TYPE = eINSTANCE.getElement_Type();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__VERSION = eINSTANCE.getElement_Version();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__VISIBILITY = eINSTANCE.getElement_Visibility();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.MethodImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__ABSTRACT = eINSTANCE.getMethod_Abstract();

		/**
		 * The meta object literal for the '<em><b>Behaviour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__BEHAVIOUR = eINSTANCE.getMethod_Behaviour();

		/**
		 * The meta object literal for the '<em><b>Classifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__CLASSIFIER = eINSTANCE.getMethod_Classifier();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__CODE = eINSTANCE.getMethod_Code();

		/**
		 * The meta object literal for the '<em><b>Is Const</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__IS_CONST = eINSTANCE.getMethod_IsConst();

		/**
		 * The meta object literal for the '<em><b>Is Leaf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__IS_LEAF = eINSTANCE.getMethod_IsLeaf();

		/**
		 * The meta object literal for the '<em><b>Is Pure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__IS_PURE = eINSTANCE.getMethod_IsPure();

		/**
		 * The meta object literal for the '<em><b>Is Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__IS_QUERY = eINSTANCE.getMethod_IsQuery();

		/**
		 * The meta object literal for the '<em><b>Is Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__IS_ROOT = eINSTANCE.getMethod_IsRoot();

		/**
		 * The meta object literal for the '<em><b>Is Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__IS_STATIC = eINSTANCE.getMethod_IsStatic();

		/**
		 * The meta object literal for the '<em><b>Is Synchronized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__IS_SYNCHRONIZED = eINSTANCE.getMethod_IsSynchronized();

		/**
		 * The meta object literal for the '<em><b>Method GUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__METHOD_GUID = eINSTANCE.getMethod_MethodGUID();

		/**
		 * The meta object literal for the '<em><b>Method ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__METHOD_ID = eINSTANCE.getMethod_MethodID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__NAME = eINSTANCE.getMethod_Name();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__NOTES = eINSTANCE.getMethod_Notes();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__PARAMETERS = eINSTANCE.getMethod_Parameters();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__PARENT = eINSTANCE.getMethod_Parent();

		/**
		 * The meta object literal for the '<em><b>Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__POS = eINSTANCE.getMethod_Pos();

		/**
		 * The meta object literal for the '<em><b>Pre Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__PRE_CONDITIONS = eINSTANCE.getMethod_PreConditions();

		/**
		 * The meta object literal for the '<em><b>Post Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__POST_CONDITIONS = eINSTANCE.getMethod_PostConditions();

		/**
		 * The meta object literal for the '<em><b>Return Is Array</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__RETURN_IS_ARRAY = eINSTANCE.getMethod_ReturnIsArray();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__RETURN_TYPE = eINSTANCE.getMethod_ReturnType();

		/**
		 * The meta object literal for the '<em><b>State Flags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__STATE_FLAGS = eINSTANCE.getMethod_StateFlags();

		/**
		 * The meta object literal for the '<em><b>Stereotype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__STEREOTYPE = eINSTANCE.getMethod_Stereotype();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__STYLE = eINSTANCE.getMethod_Style();

		/**
		 * The meta object literal for the '<em><b>Style Ex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__STYLE_EX = eINSTANCE.getMethod_StyleEx();

		/**
		 * The meta object literal for the '<em><b>Tagged Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__TAGGED_VALUES = eINSTANCE.getMethod_TaggedValues();

		/**
		 * The meta object literal for the '<em><b>Throws</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__THROWS = eINSTANCE.getMethod_Throws();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__VISIBILITY = eINSTANCE.getMethod_Visibility();

		/**
		 * The meta object literal for the '<em><b>Concurrency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__CONCURRENCY = eINSTANCE.getMethod_Concurrency();

		/**
		 * The meta object literal for the '<em><b>Gen Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__GEN_OPTION = eINSTANCE.getMethod_GenOption();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.MethodConstraintImpl <em>Method Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.MethodConstraintImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getMethodConstraint()
		 * @generated
		 */
		EClass METHOD_CONSTRAINT = eINSTANCE.getMethodConstraint();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_CONSTRAINT__NOTES = eINSTANCE.getMethodConstraint_Notes();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_CONSTRAINT__TYPE = eINSTANCE.getMethodConstraint_Type();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.PreConditionImpl <em>Pre Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.PreConditionImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getPreCondition()
		 * @generated
		 */
		EClass PRE_CONDITION = eINSTANCE.getPreCondition();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONDITION__METHOD = eINSTANCE.getPreCondition_Method();

		/**
		 * The meta object literal for the '<em><b>Pre Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRE_CONDITION__PRE_CONDITION = eINSTANCE.getPreCondition_PreCondition();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.PostConditionImpl <em>Post Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.PostConditionImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getPostCondition()
		 * @generated
		 */
		EClass POST_CONDITION = eINSTANCE.getPostCondition();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POST_CONDITION__METHOD = eINSTANCE.getPostCondition_Method();

		/**
		 * The meta object literal for the '<em><b>Post Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POST_CONDITION__POST_CONDITION = eINSTANCE.getPostCondition_PostCondition();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.MethodTagImpl <em>Method Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.MethodTagImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getMethodTag()
		 * @generated
		 */
		EClass METHOD_TAG = eINSTANCE.getMethodTag();

		/**
		 * The meta object literal for the '<em><b>FQ Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_TAG__FQ_NAME = eINSTANCE.getMethodTag_FQName();

		/**
		 * The meta object literal for the '<em><b>Method ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_TAG__METHOD_ID = eINSTANCE.getMethodTag_MethodID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_TAG__NAME = eINSTANCE.getMethodTag_Name();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_TAG__NOTES = eINSTANCE.getMethodTag_Notes();

		/**
		 * The meta object literal for the '<em><b>Tag GUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_TAG__TAG_GUID = eINSTANCE.getMethodTag_TagGUID();

		/**
		 * The meta object literal for the '<em><b>Tag ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_TAG__TAG_ID = eINSTANCE.getMethodTag_TagID();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_TAG__VALUE = eINSTANCE.getMethodTag_Value();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.PackageImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__ALIAS = eINSTANCE.getPackage_Alias();

		/**
		 * The meta object literal for the '<em><b>Batch Load</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__BATCH_LOAD = eINSTANCE.getPackage_BatchLoad();

		/**
		 * The meta object literal for the '<em><b>Batch Save</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__BATCH_SAVE = eINSTANCE.getPackage_BatchSave();

		/**
		 * The meta object literal for the '<em><b>Code Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__CODE_PATH = eINSTANCE.getPackage_CodePath();

		/**
		 * The meta object literal for the '<em><b>Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__CREATED = eINSTANCE.getPackage_Created();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__ELEMENT = eINSTANCE.getPackage_Element();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__ELEMENTS = eINSTANCE.getPackage_Elements();

		/**
		 * The meta object literal for the '<em><b>Flags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__FLAGS = eINSTANCE.getPackage_Flags();

		/**
		 * The meta object literal for the '<em><b>Is Controlled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__IS_CONTROLLED = eINSTANCE.getPackage_IsControlled();

		/**
		 * The meta object literal for the '<em><b>Is Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__IS_MODEL = eINSTANCE.getPackage_IsModel();

		/**
		 * The meta object literal for the '<em><b>Is Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__IS_NAMESPACE = eINSTANCE.getPackage_IsNamespace();

		/**
		 * The meta object literal for the '<em><b>Is Protected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__IS_PROTECTED = eINSTANCE.getPackage_IsProtected();

		/**
		 * The meta object literal for the '<em><b>Is Version Controlled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__IS_VERSION_CONTROLLED = eINSTANCE.getPackage_IsVersionControlled();

		/**
		 * The meta object literal for the '<em><b>Last Load Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__LAST_LOAD_DATE = eINSTANCE.getPackage_LastLoadDate();

		/**
		 * The meta object literal for the '<em><b>Last Save Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__LAST_SAVE_DATE = eINSTANCE.getPackage_LastSaveDate();

		/**
		 * The meta object literal for the '<em><b>Log XML</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__LOG_XML = eINSTANCE.getPackage_LogXML();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__MODIFIED = eINSTANCE.getPackage_Modified();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__NOTES = eINSTANCE.getPackage_Notes();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__OWNER = eINSTANCE.getPackage_Owner();

		/**
		 * The meta object literal for the '<em><b>Package ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__PACKAGE_ID = eINSTANCE.getPackage_PackageID();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__PACKAGES = eINSTANCE.getPackage_Packages();

		/**
		 * The meta object literal for the '<em><b>Parent ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__PARENT_ID = eINSTANCE.getPackage_ParentID();

		/**
		 * The meta object literal for the '<em><b>Tree Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__TREE_POS = eINSTANCE.getPackage_TreePos();

		/**
		 * The meta object literal for the '<em><b>UML Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__UML_VERSION = eINSTANCE.getPackage_UMLVersion();

		/**
		 * The meta object literal for the '<em><b>Use DTD</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__USE_DTD = eINSTANCE.getPackage_UseDTD();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__VERSION = eINSTANCE.getPackage_Version();

		/**
		 * The meta object literal for the '<em><b>XML Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__XML_PATH = eINSTANCE.getPackage_XMLPath();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ParameterImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__ALIAS = eINSTANCE.getParameter_Alias();

		/**
		 * The meta object literal for the '<em><b>Classifier ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__CLASSIFIER_ID = eINSTANCE.getParameter_ClassifierID();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DEFAULT = eINSTANCE.getParameter_Default();

		/**
		 * The meta object literal for the '<em><b>Is Const</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__IS_CONST = eINSTANCE.getParameter_IsConst();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__KIND = eINSTANCE.getParameter_Kind();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NOTES = eINSTANCE.getParameter_Notes();

		/**
		 * The meta object literal for the '<em><b>Operation ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__OPERATION_ID = eINSTANCE.getParameter_OperationID();

		/**
		 * The meta object literal for the '<em><b>Parameter GUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__PARAMETER_GUID = eINSTANCE.getParameter_ParameterGUID();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__POSITION = eINSTANCE.getParameter_Position();

		/**
		 * The meta object literal for the '<em><b>Stereotype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__STEREOTYPE = eINSTANCE.getParameter_Stereotype();

		/**
		 * The meta object literal for the '<em><b>Stereotype Ex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__STEREOTYPE_EX = eINSTANCE.getParameter_StereotypeEx();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__STYLE = eINSTANCE.getParameter_Style();

		/**
		 * The meta object literal for the '<em><b>Style Ex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__STYLE_EX = eINSTANCE.getParameter_StyleEx();

		/**
		 * The meta object literal for the '<em><b>Tagged Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__TAGGED_VALUES = eINSTANCE.getParameter_TaggedValues();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ParamTagImpl <em>Param Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ParamTagImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getParamTag()
		 * @generated
		 */
		EClass PARAM_TAG = eINSTANCE.getParamTag();

		/**
		 * The meta object literal for the '<em><b>Element GUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM_TAG__ELEMENT_GUID = eINSTANCE.getParamTag_ElementGUID();

		/**
		 * The meta object literal for the '<em><b>FQ Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM_TAG__FQ_NAME = eINSTANCE.getParamTag_FQName();

		/**
		 * The meta object literal for the '<em><b>Property GUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM_TAG__PROPERTY_GUID = eINSTANCE.getParamTag_PropertyGUID();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM_TAG__TAG = eINSTANCE.getParamTag_Tag();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM_TAG__VALUE = eINSTANCE.getParamTag_Value();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.TaggedValueImpl <em>Tagged Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.TaggedValueImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getTaggedValue()
		 * @generated
		 */
		EClass TAGGED_VALUE = eINSTANCE.getTaggedValue();

		/**
		 * The meta object literal for the '<em><b>Element ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGGED_VALUE__ELEMENT_ID = eINSTANCE.getTaggedValue_ElementID();

		/**
		 * The meta object literal for the '<em><b>FQ Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGGED_VALUE__FQ_NAME = eINSTANCE.getTaggedValue_FQName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGGED_VALUE__NAME = eINSTANCE.getTaggedValue_Name();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGGED_VALUE__NOTES = eINSTANCE.getTaggedValue_Notes();

		/**
		 * The meta object literal for the '<em><b>Property GUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGGED_VALUE__PROPERTY_GUID = eINSTANCE.getTaggedValue_PropertyGUID();

		/**
		 * The meta object literal for the '<em><b>Property ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGGED_VALUE__PROPERTY_ID = eINSTANCE.getTaggedValue_PropertyID();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGGED_VALUE__VALUE = eINSTANCE.getTaggedValue_Value();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.DirectionType <em>Direction Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.DirectionType
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getDirectionType()
		 * @generated
		 */
		EEnum DIRECTION_TYPE = eINSTANCE.getDirectionType();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorType <em>Connector Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorType
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getConnectorType()
		 * @generated
		 */
		EEnum CONNECTOR_TYPE = eINSTANCE.getConnectorType();

	}

} //XcorePackage
