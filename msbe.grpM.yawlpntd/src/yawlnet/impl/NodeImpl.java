/**
 */
package yawlnet.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;

import yawlnet.Arc;
import yawlnet.Node;
import yawlnet.YawlnetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link yawlnet.impl.NodeImpl#getPetrinet <em>Petrinet</em>}</li>
 *   <li>{@link yawlnet.impl.NodeImpl#getIn <em>In</em>}</li>
 *   <li>{@link yawlnet.impl.NodeImpl#getOut <em>Out</em>}</li>
 *   <li>{@link yawlnet.impl.NodeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends MinimalEObjectImpl.Container implements Node {
	/**
	 * The cached value of the '{@link #getPetrinet() <em>Petrinet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPetrinet()
	 * @generated
	 * @ordered
	 */
	protected PetriNet petrinet;

	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> in;

	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> out;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YawlnetPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNet getPetrinet() {
		if (petrinet != null && petrinet.eIsProxy()) {
			InternalEObject oldPetrinet = (InternalEObject)petrinet;
			petrinet = (PetriNet)eResolveProxy(oldPetrinet);
			if (petrinet != oldPetrinet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YawlnetPackage.NODE__PETRINET, oldPetrinet, petrinet));
			}
		}
		return petrinet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNet basicGetPetrinet() {
		return petrinet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPetrinet(PetriNet newPetrinet) {
		PetriNet oldPetrinet = petrinet;
		petrinet = newPetrinet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YawlnetPackage.NODE__PETRINET, oldPetrinet, petrinet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arc> getIn() {
		if (in == null) {
			in = new EObjectResolvingEList<Arc>(Arc.class, this, YawlnetPackage.NODE__IN);
		}
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arc> getOut() {
		if (out == null) {
			out = new EObjectResolvingEList<Arc>(Arc.class, this, YawlnetPackage.NODE__OUT);
		}
		return out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YawlnetPackage.NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case YawlnetPackage.NODE__PETRINET:
				if (resolve) return getPetrinet();
				return basicGetPetrinet();
			case YawlnetPackage.NODE__IN:
				return getIn();
			case YawlnetPackage.NODE__OUT:
				return getOut();
			case YawlnetPackage.NODE__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case YawlnetPackage.NODE__PETRINET:
				setPetrinet((PetriNet)newValue);
				return;
			case YawlnetPackage.NODE__IN:
				getIn().clear();
				getIn().addAll((Collection<? extends Arc>)newValue);
				return;
			case YawlnetPackage.NODE__OUT:
				getOut().clear();
				getOut().addAll((Collection<? extends Arc>)newValue);
				return;
			case YawlnetPackage.NODE__NAME:
				setName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case YawlnetPackage.NODE__PETRINET:
				setPetrinet((PetriNet)null);
				return;
			case YawlnetPackage.NODE__IN:
				getIn().clear();
				return;
			case YawlnetPackage.NODE__OUT:
				getOut().clear();
				return;
			case YawlnetPackage.NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case YawlnetPackage.NODE__PETRINET:
				return petrinet != null;
			case YawlnetPackage.NODE__IN:
				return in != null && !in.isEmpty();
			case YawlnetPackage.NODE__OUT:
				return out != null && !out.isEmpty();
			case YawlnetPackage.NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
