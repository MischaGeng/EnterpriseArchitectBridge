/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.xcore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getAlias <em>Alias</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getClient <em>Client</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getColor <em>Color</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getConnectorID <em>Connector ID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDirection <em>Direction</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getEndPointX <em>End Point X</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getEndPointY <em>End Point Y</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getEventFlags <em>Event Flags</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getIsRoot <em>Is Root</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getIsSpec <em>Is Spec</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getMetaType <em>Meta Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getMiscData <em>Misc Data</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getNotes <em>Notes</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getRouteStyle <em>Route Style</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSequenceNo <em>Sequence No</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getStartPointX <em>Start Point X</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getStartPointY <em>Start Point Y</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getStateFlags <em>State Flags</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getStyleEx <em>Style Ex</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getTaggedValues <em>Tagged Values</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getTransitionAction <em>Transition Action</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getTransitionEvent <em>Transition Event</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getTransitionGuard <em>Transition Guard</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getType <em>Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getVirtualInheritance <em>Virtual Inheritance</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getWidth <em>Width</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSource <em>Source</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDest <em>Dest</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSourceCard <em>Source Card</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSourceAccess <em>Source Access</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSourceElement <em>Source Element</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSourceRole <em>Source Role</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSourceRoleType <em>Source Role Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSourceRoleNote <em>Source Role Note</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSourceContainment <em>Source Containment</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#isSourceIsAggregate <em>Source Is Aggregate</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#isSourceIsOrdered <em>Source Is Ordered</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSourceQualifier <em>Source Qualifier</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDestCard <em>Dest Card</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDestAccess <em>Dest Access</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDestElement <em>Dest Element</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDestRole <em>Dest Role</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDestRoleType <em>Dest Role Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDestRoleNote <em>Dest Role Note</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDestContainment <em>Dest Containment</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#isDestIsAggregate <em>Dest Is Aggregate</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#isDestIsOrdered <em>Dest Is Ordered</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDestQualifier <em>Dest Qualifier</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getTop_Start_Label <em>Top Start Label</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getTop_Mid_Label <em>Top Mid Label</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getTop_End_Label <em>Top End Label</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getBtm_StartLabel <em>Btm Start Label</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getBtm_MidLabel <em>Btm Mid Label</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getBtm_EndLabel <em>Btm End Label</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getStart_Edge <em>Start Edge</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getEnd_Edge <em>End Edge</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getHeadStyle <em>Head Style</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getLineStyle <em>Line Style</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends EObject {
	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_Alias()
	 * @model unique="false"
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

	/**
	 * Returns the value of the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' reference.
	 * @see #setClient(Element)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_Client()
	 * @model
	 * @generated
	 */
	Element getClient();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getClient <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client</em>' reference.
	 * @see #getClient()
	 * @generated
	 */
	void setClient(Element value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(Long)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_Color()
	 * @model unique="false"
	 * @generated
	 */
	Long getColor();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Long value);

	/**
	 * Returns the value of the '<em><b>Connector ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector ID</em>' attribute.
	 * @see #setConnectorID(Long)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_ConnectorID()
	 * @model unique="false"
	 * @generated
	 */
	Long getConnectorID();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getConnectorID <em>Connector ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector ID</em>' attribute.
	 * @see #getConnectorID()
	 * @generated
	 */
	void setConnectorID(Long value);

	/**
	 * Returns the value of the '<em><b>Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram</em>' reference.
	 * @see #setDiagram(Diagram)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_Diagram()
	 * @model
	 * @generated
	 */
	Diagram getDiagram();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDiagram <em>Diagram</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram</em>' reference.
	 * @see #getDiagram()
	 * @generated
	 */
	void setDiagram(Diagram value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link de.cooperateproject.eabridge.eaobjectmodel.xcore.DirectionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.DirectionType
	 * @see #setDirection(DirectionType)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_Direction()
	 * @model unique="false"
	 * @generated
	 */
	DirectionType getDirection();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.DirectionType
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(DirectionType value);

	/**
	 * Returns the value of the '<em><b>End Point X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Point X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Point X</em>' attribute.
	 * @see #setEndPointX(Long)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_EndPointX()
	 * @model unique="false"
	 * @generated
	 */
	Long getEndPointX();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getEndPointX <em>End Point X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Point X</em>' attribute.
	 * @see #getEndPointX()
	 * @generated
	 */
	void setEndPointX(Long value);

	/**
	 * Returns the value of the '<em><b>End Point Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Point Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Point Y</em>' attribute.
	 * @see #setEndPointY(Long)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_EndPointY()
	 * @model unique="false"
	 * @generated
	 */
	Long getEndPointY();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getEndPointY <em>End Point Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Point Y</em>' attribute.
	 * @see #getEndPointY()
	 * @generated
	 */
	void setEndPointY(Long value);

	/**
	 * Returns the value of the '<em><b>Event Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Flags</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Flags</em>' attribute.
	 * @see #setEventFlags(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_EventFlags()
	 * @model unique="false"
	 * @generated
	 */
	String getEventFlags();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getEventFlags <em>Event Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Flags</em>' attribute.
	 * @see #getEventFlags()
	 * @generated
	 */
	void setEventFlags(String value);

	/**
	 * Returns the value of the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Leaf</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Leaf</em>' attribute.
	 * @see #setIsLeaf(Boolean)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_IsLeaf()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getIsLeaf();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getIsLeaf <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Leaf</em>' attribute.
	 * @see #getIsLeaf()
	 * @generated
	 */
	void setIsLeaf(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Root</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Root</em>' attribute.
	 * @see #setIsRoot(Boolean)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_IsRoot()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getIsRoot();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getIsRoot <em>Is Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Root</em>' attribute.
	 * @see #getIsRoot()
	 * @generated
	 */
	void setIsRoot(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Spec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Spec</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Spec</em>' attribute.
	 * @see #setIsSpec(Boolean)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_IsSpec()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getIsSpec();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getIsSpec <em>Is Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Spec</em>' attribute.
	 * @see #getIsSpec()
	 * @generated
	 */
	void setIsSpec(Boolean value);

	/**
	 * Returns the value of the '<em><b>Meta Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Type</em>' attribute.
	 * @see #setMetaType(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_MetaType()
	 * @model unique="false"
	 * @generated
	 */
	String getMetaType();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getMetaType <em>Meta Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Type</em>' attribute.
	 * @see #getMetaType()
	 * @generated
	 */
	void setMetaType(String value);

	/**
	 * Returns the value of the '<em><b>Misc Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Misc Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Misc Data</em>' attribute.
	 * @see #setMiscData(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_MiscData()
	 * @model unique="false"
	 * @generated
	 */
	String getMiscData();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getMiscData <em>Misc Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Misc Data</em>' attribute.
	 * @see #getMiscData()
	 * @generated
	 */
	void setMiscData(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes</em>' attribute.
	 * @see #setNotes(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_Notes()
	 * @model unique="false"
	 * @generated
	 */
	String getNotes();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getNotes <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' attribute.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(String value);

	/**
	 * Returns the value of the '<em><b>Route Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route Style</em>' attribute.
	 * @see #setRouteStyle(Long)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_RouteStyle()
	 * @model unique="false"
	 * @generated
	 */
	Long getRouteStyle();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getRouteStyle <em>Route Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Style</em>' attribute.
	 * @see #getRouteStyle()
	 * @generated
	 */
	void setRouteStyle(Long value);

	/**
	 * Returns the value of the '<em><b>Sequence No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence No</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence No</em>' attribute.
	 * @see #setSequenceNo(Long)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_SequenceNo()
	 * @model unique="false"
	 * @generated
	 */
	Long getSequenceNo();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSequenceNo <em>Sequence No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence No</em>' attribute.
	 * @see #getSequenceNo()
	 * @generated
	 */
	void setSequenceNo(Long value);

	/**
	 * Returns the value of the '<em><b>Start Point X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Point X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Point X</em>' attribute.
	 * @see #setStartPointX(Long)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_StartPointX()
	 * @model unique="false"
	 * @generated
	 */
	Long getStartPointX();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getStartPointX <em>Start Point X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Point X</em>' attribute.
	 * @see #getStartPointX()
	 * @generated
	 */
	void setStartPointX(Long value);

	/**
	 * Returns the value of the '<em><b>Start Point Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Point Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Point Y</em>' attribute.
	 * @see #setStartPointY(Long)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_StartPointY()
	 * @model unique="false"
	 * @generated
	 */
	Long getStartPointY();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getStartPointY <em>Start Point Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Point Y</em>' attribute.
	 * @see #getStartPointY()
	 * @generated
	 */
	void setStartPointY(Long value);

	/**
	 * Returns the value of the '<em><b>State Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Flags</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Flags</em>' attribute.
	 * @see #setStateFlags(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_StateFlags()
	 * @model unique="false"
	 * @generated
	 */
	String getStateFlags();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getStateFlags <em>State Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Flags</em>' attribute.
	 * @see #getStateFlags()
	 * @generated
	 */
	void setStateFlags(String value);

	/**
	 * Returns the value of the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stereotype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stereotype</em>' attribute.
	 * @see #setStereotype(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_Stereotype()
	 * @model unique="false"
	 * @generated
	 */
	String getStereotype();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getStereotype <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stereotype</em>' attribute.
	 * @see #getStereotype()
	 * @generated
	 */
	void setStereotype(String value);

	/**
	 * Returns the value of the '<em><b>Style Ex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Ex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Ex</em>' attribute.
	 * @see #setStyleEx(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_StyleEx()
	 * @model unique="false"
	 * @generated
	 */
	String getStyleEx();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getStyleEx <em>Style Ex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Ex</em>' attribute.
	 * @see #getStyleEx()
	 * @generated
	 */
	void setStyleEx(String value);

	/**
	 * Returns the value of the '<em><b>Sub Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Type</em>' attribute.
	 * @see #setSubType(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_SubType()
	 * @model unique="false"
	 * @generated
	 */
	String getSubType();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSubType <em>Sub Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Type</em>' attribute.
	 * @see #getSubType()
	 * @generated
	 */
	void setSubType(String value);

	/**
	 * Returns the value of the '<em><b>Supplier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier</em>' reference.
	 * @see #setSupplier(Element)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_Supplier()
	 * @model
	 * @generated
	 */
	Element getSupplier();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSupplier <em>Supplier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier</em>' reference.
	 * @see #getSupplier()
	 * @generated
	 */
	void setSupplier(Element value);

	/**
	 * Returns the value of the '<em><b>Tagged Values</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorTag#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tagged Values</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tagged Values</em>' containment reference.
	 * @see #setTaggedValues(ConnectorTag)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_TaggedValues()
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorTag#getConnector
	 * @model opposite="Connector" containment="true"
	 * @generated
	 */
	ConnectorTag getTaggedValues();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getTaggedValues <em>Tagged Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tagged Values</em>' containment reference.
	 * @see #getTaggedValues()
	 * @generated
	 */
	void setTaggedValues(ConnectorTag value);

	/**
	 * Returns the value of the '<em><b>Transition Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Action</em>' attribute.
	 * @see #setTransitionAction(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_TransitionAction()
	 * @model unique="false"
	 * @generated
	 */
	String getTransitionAction();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getTransitionAction <em>Transition Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Action</em>' attribute.
	 * @see #getTransitionAction()
	 * @generated
	 */
	void setTransitionAction(String value);

	/**
	 * Returns the value of the '<em><b>Transition Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Event</em>' attribute.
	 * @see #setTransitionEvent(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_TransitionEvent()
	 * @model unique="false"
	 * @generated
	 */
	String getTransitionEvent();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getTransitionEvent <em>Transition Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Event</em>' attribute.
	 * @see #getTransitionEvent()
	 * @generated
	 */
	void setTransitionEvent(String value);

	/**
	 * Returns the value of the '<em><b>Transition Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition Guard</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Guard</em>' attribute.
	 * @see #setTransitionGuard(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_TransitionGuard()
	 * @model unique="false"
	 * @generated
	 */
	String getTransitionGuard();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getTransitionGuard <em>Transition Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Guard</em>' attribute.
	 * @see #getTransitionGuard()
	 * @generated
	 */
	void setTransitionGuard(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorType
	 * @see #setType(ConnectorType)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_Type()
	 * @model unique="false"
	 * @generated
	 */
	ConnectorType getType();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorType
	 * @see #getType()
	 * @generated
	 */
	void setType(ConnectorType value);

	/**
	 * Returns the value of the '<em><b>Virtual Inheritance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Inheritance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Inheritance</em>' attribute.
	 * @see #setVirtualInheritance(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_VirtualInheritance()
	 * @model unique="false"
	 * @generated
	 */
	String getVirtualInheritance();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getVirtualInheritance <em>Virtual Inheritance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual Inheritance</em>' attribute.
	 * @see #getVirtualInheritance()
	 * @generated
	 */
	void setVirtualInheritance(String value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(Long)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_Width()
	 * @model unique="false"
	 * @generated
	 */
	Long getWidth();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(Long value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Element)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_Source()
	 * @model
	 * @generated
	 */
	Element getSource();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Element value);

	/**
	 * Returns the value of the '<em><b>Dest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest</em>' reference.
	 * @see #setDest(Element)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_Dest()
	 * @model
	 * @generated
	 */
	Element getDest();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDest <em>Dest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest</em>' reference.
	 * @see #getDest()
	 * @generated
	 */
	void setDest(Element value);

	/**
	 * Returns the value of the '<em><b>Source Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Card</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Card</em>' attribute.
	 * @see #setSourceCard(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_SourceCard()
	 * @model unique="false"
	 * @generated
	 */
	String getSourceCard();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSourceCard <em>Source Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Card</em>' attribute.
	 * @see #getSourceCard()
	 * @generated
	 */
	void setSourceCard(String value);

	/**
	 * Returns the value of the '<em><b>Source Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Access</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Access</em>' attribute.
	 * @see #setSourceAccess(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_SourceAccess()
	 * @model unique="false"
	 * @generated
	 */
	String getSourceAccess();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSourceAccess <em>Source Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Access</em>' attribute.
	 * @see #getSourceAccess()
	 * @generated
	 */
	void setSourceAccess(String value);

	/**
	 * Returns the value of the '<em><b>Source Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Element</em>' attribute.
	 * @see #setSourceElement(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_SourceElement()
	 * @model unique="false"
	 * @generated
	 */
	String getSourceElement();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSourceElement <em>Source Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Element</em>' attribute.
	 * @see #getSourceElement()
	 * @generated
	 */
	void setSourceElement(String value);

	/**
	 * Returns the value of the '<em><b>Source Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Role</em>' attribute.
	 * @see #setSourceRole(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_SourceRole()
	 * @model unique="false"
	 * @generated
	 */
	String getSourceRole();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSourceRole <em>Source Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Role</em>' attribute.
	 * @see #getSourceRole()
	 * @generated
	 */
	void setSourceRole(String value);

	/**
	 * Returns the value of the '<em><b>Source Role Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Role Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Role Type</em>' attribute.
	 * @see #setSourceRoleType(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_SourceRoleType()
	 * @model unique="false"
	 * @generated
	 */
	String getSourceRoleType();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSourceRoleType <em>Source Role Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Role Type</em>' attribute.
	 * @see #getSourceRoleType()
	 * @generated
	 */
	void setSourceRoleType(String value);

	/**
	 * Returns the value of the '<em><b>Source Role Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Role Note</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Role Note</em>' attribute.
	 * @see #setSourceRoleNote(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_SourceRoleNote()
	 * @model unique="false"
	 * @generated
	 */
	String getSourceRoleNote();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSourceRoleNote <em>Source Role Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Role Note</em>' attribute.
	 * @see #getSourceRoleNote()
	 * @generated
	 */
	void setSourceRoleNote(String value);

	/**
	 * Returns the value of the '<em><b>Source Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Containment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Containment</em>' attribute.
	 * @see #setSourceContainment(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_SourceContainment()
	 * @model unique="false"
	 * @generated
	 */
	String getSourceContainment();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSourceContainment <em>Source Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Containment</em>' attribute.
	 * @see #getSourceContainment()
	 * @generated
	 */
	void setSourceContainment(String value);

	/**
	 * Returns the value of the '<em><b>Source Is Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Is Aggregate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Is Aggregate</em>' attribute.
	 * @see #setSourceIsAggregate(boolean)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_SourceIsAggregate()
	 * @model unique="false"
	 * @generated
	 */
	boolean isSourceIsAggregate();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#isSourceIsAggregate <em>Source Is Aggregate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Is Aggregate</em>' attribute.
	 * @see #isSourceIsAggregate()
	 * @generated
	 */
	void setSourceIsAggregate(boolean value);

	/**
	 * Returns the value of the '<em><b>Source Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Is Ordered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Is Ordered</em>' attribute.
	 * @see #setSourceIsOrdered(boolean)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_SourceIsOrdered()
	 * @model unique="false"
	 * @generated
	 */
	boolean isSourceIsOrdered();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#isSourceIsOrdered <em>Source Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Is Ordered</em>' attribute.
	 * @see #isSourceIsOrdered()
	 * @generated
	 */
	void setSourceIsOrdered(boolean value);

	/**
	 * Returns the value of the '<em><b>Source Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Qualifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Qualifier</em>' attribute.
	 * @see #setSourceQualifier(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_SourceQualifier()
	 * @model unique="false"
	 * @generated
	 */
	String getSourceQualifier();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSourceQualifier <em>Source Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Qualifier</em>' attribute.
	 * @see #getSourceQualifier()
	 * @generated
	 */
	void setSourceQualifier(String value);

	/**
	 * Returns the value of the '<em><b>Dest Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest Card</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest Card</em>' attribute.
	 * @see #setDestCard(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_DestCard()
	 * @model unique="false"
	 * @generated
	 */
	String getDestCard();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDestCard <em>Dest Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest Card</em>' attribute.
	 * @see #getDestCard()
	 * @generated
	 */
	void setDestCard(String value);

	/**
	 * Returns the value of the '<em><b>Dest Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest Access</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest Access</em>' attribute.
	 * @see #setDestAccess(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_DestAccess()
	 * @model unique="false"
	 * @generated
	 */
	String getDestAccess();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDestAccess <em>Dest Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest Access</em>' attribute.
	 * @see #getDestAccess()
	 * @generated
	 */
	void setDestAccess(String value);

	/**
	 * Returns the value of the '<em><b>Dest Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest Element</em>' attribute.
	 * @see #setDestElement(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_DestElement()
	 * @model unique="false"
	 * @generated
	 */
	String getDestElement();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDestElement <em>Dest Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest Element</em>' attribute.
	 * @see #getDestElement()
	 * @generated
	 */
	void setDestElement(String value);

	/**
	 * Returns the value of the '<em><b>Dest Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest Role</em>' attribute.
	 * @see #setDestRole(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_DestRole()
	 * @model unique="false"
	 * @generated
	 */
	String getDestRole();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDestRole <em>Dest Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest Role</em>' attribute.
	 * @see #getDestRole()
	 * @generated
	 */
	void setDestRole(String value);

	/**
	 * Returns the value of the '<em><b>Dest Role Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest Role Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest Role Type</em>' attribute.
	 * @see #setDestRoleType(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_DestRoleType()
	 * @model unique="false"
	 * @generated
	 */
	String getDestRoleType();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDestRoleType <em>Dest Role Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest Role Type</em>' attribute.
	 * @see #getDestRoleType()
	 * @generated
	 */
	void setDestRoleType(String value);

	/**
	 * Returns the value of the '<em><b>Dest Role Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest Role Note</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest Role Note</em>' attribute.
	 * @see #setDestRoleNote(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_DestRoleNote()
	 * @model unique="false"
	 * @generated
	 */
	String getDestRoleNote();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDestRoleNote <em>Dest Role Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest Role Note</em>' attribute.
	 * @see #getDestRoleNote()
	 * @generated
	 */
	void setDestRoleNote(String value);

	/**
	 * Returns the value of the '<em><b>Dest Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest Containment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest Containment</em>' attribute.
	 * @see #setDestContainment(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_DestContainment()
	 * @model unique="false"
	 * @generated
	 */
	String getDestContainment();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDestContainment <em>Dest Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest Containment</em>' attribute.
	 * @see #getDestContainment()
	 * @generated
	 */
	void setDestContainment(String value);

	/**
	 * Returns the value of the '<em><b>Dest Is Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest Is Aggregate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest Is Aggregate</em>' attribute.
	 * @see #setDestIsAggregate(boolean)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_DestIsAggregate()
	 * @model unique="false"
	 * @generated
	 */
	boolean isDestIsAggregate();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#isDestIsAggregate <em>Dest Is Aggregate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest Is Aggregate</em>' attribute.
	 * @see #isDestIsAggregate()
	 * @generated
	 */
	void setDestIsAggregate(boolean value);

	/**
	 * Returns the value of the '<em><b>Dest Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest Is Ordered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest Is Ordered</em>' attribute.
	 * @see #setDestIsOrdered(boolean)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_DestIsOrdered()
	 * @model unique="false"
	 * @generated
	 */
	boolean isDestIsOrdered();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#isDestIsOrdered <em>Dest Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest Is Ordered</em>' attribute.
	 * @see #isDestIsOrdered()
	 * @generated
	 */
	void setDestIsOrdered(boolean value);

	/**
	 * Returns the value of the '<em><b>Dest Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest Qualifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest Qualifier</em>' attribute.
	 * @see #setDestQualifier(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_DestQualifier()
	 * @model unique="false"
	 * @generated
	 */
	String getDestQualifier();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDestQualifier <em>Dest Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest Qualifier</em>' attribute.
	 * @see #getDestQualifier()
	 * @generated
	 */
	void setDestQualifier(String value);

	/**
	 * Returns the value of the '<em><b>Top Start Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Start Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Start Label</em>' attribute.
	 * @see #setTop_Start_Label(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_Top_Start_Label()
	 * @model unique="false"
	 * @generated
	 */
	String getTop_Start_Label();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getTop_Start_Label <em>Top Start Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Start Label</em>' attribute.
	 * @see #getTop_Start_Label()
	 * @generated
	 */
	void setTop_Start_Label(String value);

	/**
	 * Returns the value of the '<em><b>Top Mid Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Mid Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Mid Label</em>' attribute.
	 * @see #setTop_Mid_Label(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_Top_Mid_Label()
	 * @model unique="false"
	 * @generated
	 */
	String getTop_Mid_Label();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getTop_Mid_Label <em>Top Mid Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Mid Label</em>' attribute.
	 * @see #getTop_Mid_Label()
	 * @generated
	 */
	void setTop_Mid_Label(String value);

	/**
	 * Returns the value of the '<em><b>Top End Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top End Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top End Label</em>' attribute.
	 * @see #setTop_End_Label(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_Top_End_Label()
	 * @model unique="false"
	 * @generated
	 */
	String getTop_End_Label();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getTop_End_Label <em>Top End Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top End Label</em>' attribute.
	 * @see #getTop_End_Label()
	 * @generated
	 */
	void setTop_End_Label(String value);

	/**
	 * Returns the value of the '<em><b>Btm Start Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Btm Start Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Btm Start Label</em>' attribute.
	 * @see #setBtm_StartLabel(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_Btm_StartLabel()
	 * @model unique="false"
	 * @generated
	 */
	String getBtm_StartLabel();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getBtm_StartLabel <em>Btm Start Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Btm Start Label</em>' attribute.
	 * @see #getBtm_StartLabel()
	 * @generated
	 */
	void setBtm_StartLabel(String value);

	/**
	 * Returns the value of the '<em><b>Btm Mid Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Btm Mid Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Btm Mid Label</em>' attribute.
	 * @see #setBtm_MidLabel(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_Btm_MidLabel()
	 * @model unique="false"
	 * @generated
	 */
	String getBtm_MidLabel();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getBtm_MidLabel <em>Btm Mid Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Btm Mid Label</em>' attribute.
	 * @see #getBtm_MidLabel()
	 * @generated
	 */
	void setBtm_MidLabel(String value);

	/**
	 * Returns the value of the '<em><b>Btm End Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Btm End Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Btm End Label</em>' attribute.
	 * @see #setBtm_EndLabel(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_Btm_EndLabel()
	 * @model unique="false"
	 * @generated
	 */
	String getBtm_EndLabel();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getBtm_EndLabel <em>Btm End Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Btm End Label</em>' attribute.
	 * @see #getBtm_EndLabel()
	 * @generated
	 */
	void setBtm_EndLabel(String value);

	/**
	 * Returns the value of the '<em><b>Start Edge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Edge</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Edge</em>' attribute.
	 * @see #setStart_Edge(int)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_Start_Edge()
	 * @model unique="false"
	 * @generated
	 */
	int getStart_Edge();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getStart_Edge <em>Start Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Edge</em>' attribute.
	 * @see #getStart_Edge()
	 * @generated
	 */
	void setStart_Edge(int value);

	/**
	 * Returns the value of the '<em><b>End Edge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Edge</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Edge</em>' attribute.
	 * @see #setEnd_Edge(int)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_End_Edge()
	 * @model unique="false"
	 * @generated
	 */
	int getEnd_Edge();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getEnd_Edge <em>End Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Edge</em>' attribute.
	 * @see #getEnd_Edge()
	 * @generated
	 */
	void setEnd_Edge(int value);

	/**
	 * Returns the value of the '<em><b>Head Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Head Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head Style</em>' attribute.
	 * @see #setHeadStyle(int)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_HeadStyle()
	 * @model unique="false"
	 * @generated
	 */
	int getHeadStyle();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getHeadStyle <em>Head Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head Style</em>' attribute.
	 * @see #getHeadStyle()
	 * @generated
	 */
	void setHeadStyle(int value);

	/**
	 * Returns the value of the '<em><b>Line Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Style</em>' attribute.
	 * @see #setLineStyle(int)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnector_LineStyle()
	 * @model unique="false"
	 * @generated
	 */
	int getLineStyle();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getLineStyle <em>Line Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Style</em>' attribute.
	 * @see #getLineStyle()
	 * @generated
	 */
	void setLineStyle(int value);

} // Connector