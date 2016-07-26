/**
 */
package msbe.grpM.yawlpntd.yawlnet;

import org.pnml.tools.epnk.pnmlcoremodel.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link msbe.grpM.yawlpntd.yawlnet.PlaceType#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see msbe.grpM.yawlpntd.yawlnet.YawlnetPackage#getPlaceType()
 * @model
 * @generated
 */
public interface PlaceType extends Attribute {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * The literals are from the enumeration {@link msbe.grpM.yawlpntd.yawlnet.PType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see msbe.grpM.yawlpntd.yawlnet.PType
	 * @see #setText(PType)
	 * @see msbe.grpM.yawlpntd.yawlnet.YawlnetPackage#getPlaceType_Text()
	 * @model
	 * @generated
	 */
	PType getText();

	/**
	 * Sets the value of the '{@link msbe.grpM.yawlpntd.yawlnet.PlaceType#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see msbe.grpM.yawlpntd.yawlnet.PType
	 * @see #getText()
	 * @generated
	 */
	void setText(PType value);

} // PlaceType
