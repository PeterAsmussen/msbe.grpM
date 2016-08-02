/**
 */
package yawlnet.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import yawlnet.Place;
import yawlnet.PlaceType;
import yawlnet.Token;
import yawlnet.YawlnetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link yawlnet.impl.PlaceImpl#getType <em>Type</em>}</li>
 *   <li>{@link yawlnet.impl.PlaceImpl#getTokens <em>Tokens</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlaceImpl extends org.pnml.tools.epnk.pnmlcoremodel.impl.PlaceImpl implements Place {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected PlaceType type;

	/**
	 * The cached value of the '{@link #getTokens() <em>Tokens</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokens()
	 * @generated
	 * @ordered
	 */
	protected Token tokens;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YawlnetPackage.Literals.PLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(PlaceType newType, NotificationChain msgs) {
		PlaceType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YawlnetPackage.PLACE__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(PlaceType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - YawlnetPackage.PLACE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - YawlnetPackage.PLACE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YawlnetPackage.PLACE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token getTokens() {
		if (tokens != null && tokens.eIsProxy()) {
			InternalEObject oldTokens = (InternalEObject)tokens;
			tokens = (Token)eResolveProxy(oldTokens);
			if (tokens != oldTokens) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YawlnetPackage.PLACE__TOKENS, oldTokens, tokens));
			}
		}
		return tokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token basicGetTokens() {
		return tokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTokens(Token newTokens, NotificationChain msgs) {
		Token oldTokens = tokens;
		tokens = newTokens;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YawlnetPackage.PLACE__TOKENS, oldTokens, newTokens);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTokens(Token newTokens) {
		if (newTokens != tokens) {
			NotificationChain msgs = null;
			if (tokens != null)
				msgs = ((InternalEObject)tokens).eInverseRemove(this, YawlnetPackage.TOKEN__PLACE, Token.class, msgs);
			if (newTokens != null)
				msgs = ((InternalEObject)newTokens).eInverseAdd(this, YawlnetPackage.TOKEN__PLACE, Token.class, msgs);
			msgs = basicSetTokens(newTokens, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YawlnetPackage.PLACE__TOKENS, newTokens, newTokens));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case YawlnetPackage.PLACE__TOKENS:
				if (tokens != null)
					msgs = ((InternalEObject)tokens).eInverseRemove(this, YawlnetPackage.TOKEN__PLACE, Token.class, msgs);
				return basicSetTokens((Token)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case YawlnetPackage.PLACE__TYPE:
				return basicSetType(null, msgs);
			case YawlnetPackage.PLACE__TOKENS:
				return basicSetTokens(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case YawlnetPackage.PLACE__TYPE:
				return getType();
			case YawlnetPackage.PLACE__TOKENS:
				if (resolve) return getTokens();
				return basicGetTokens();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case YawlnetPackage.PLACE__TYPE:
				setType((PlaceType)newValue);
				return;
			case YawlnetPackage.PLACE__TOKENS:
				setTokens((Token)newValue);
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
			case YawlnetPackage.PLACE__TYPE:
				setType((PlaceType)null);
				return;
			case YawlnetPackage.PLACE__TOKENS:
				setTokens((Token)null);
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
			case YawlnetPackage.PLACE__TYPE:
				return type != null;
			case YawlnetPackage.PLACE__TOKENS:
				return tokens != null;
		}
		return super.eIsSet(featureID);
	}

} //PlaceImpl
