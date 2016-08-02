/**
 */
package yawlnet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yawlnet.Node#getPetrinet <em>Petrinet</em>}</li>
 *   <li>{@link yawlnet.Node#getIn <em>In</em>}</li>
 *   <li>{@link yawlnet.Node#getOut <em>Out</em>}</li>
 *   <li>{@link yawlnet.Node#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see yawlnet.YawlnetPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Petrinet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petrinet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petrinet</em>' reference.
	 * @see #setPetrinet(PetriNet)
	 * @see yawlnet.YawlnetPackage#getNode_Petrinet()
	 * @model
	 * @generated
	 */
	PetriNet getPetrinet();

	/**
	 * Sets the value of the '{@link yawlnet.Node#getPetrinet <em>Petrinet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Petrinet</em>' reference.
	 * @see #getPetrinet()
	 * @generated
	 */
	void setPetrinet(PetriNet value);

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link yawlnet.Arc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see yawlnet.YawlnetPackage#getNode_In()
	 * @model
	 * @generated
	 */
	EList<Arc> getIn();

	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link yawlnet.Arc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see yawlnet.YawlnetPackage#getNode_Out()
	 * @model
	 * @generated
	 */
	EList<Arc> getOut();

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
	 * @see yawlnet.YawlnetPackage#getNode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link yawlnet.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Node
