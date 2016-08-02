/**
 */
package yawlnet;

import org.pnml.tools.epnk.pnmlcoremodel.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yawlnet.ControlType#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see yawlnet.YawlnetPackage#getControlType()
 * @model
 * @generated
 */
public interface ControlType extends Attribute {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * The literals are from the enumeration {@link yawlnet.CType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see yawlnet.CType
	 * @see #setText(CType)
	 * @see yawlnet.YawlnetPackage#getControlType_Text()
	 * @model
	 * @generated
	 */
	CType getText();

	/**
	 * Sets the value of the '{@link yawlnet.ControlType#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see yawlnet.CType
	 * @see #getText()
	 * @generated
	 */
	void setText(CType value);

} // ControlType
