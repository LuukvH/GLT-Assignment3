/**
 */
package platoon.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import platoon.FollowingVehicle;
import platoon.PlatoonPackage;
import platoon.Vehicle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Following Vehicle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link platoon.impl.FollowingVehicleImpl#getFollowing <em>Following</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FollowingVehicleImpl extends VehicleImpl implements FollowingVehicle {
	/**
	 * The cached value of the '{@link #getFollowing() <em>Following</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowing()
	 * @generated
	 * @ordered
	 */
	protected Vehicle following;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FollowingVehicleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatoonPackage.Literals.FOLLOWING_VEHICLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vehicle getFollowing() {
		if (following != null && following.eIsProxy()) {
			InternalEObject oldFollowing = (InternalEObject)following;
			following = (Vehicle)eResolveProxy(oldFollowing);
			if (following != oldFollowing) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlatoonPackage.FOLLOWING_VEHICLE__FOLLOWING, oldFollowing, following));
			}
		}
		return following;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vehicle basicGetFollowing() {
		return following;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFollowing(Vehicle newFollowing) {
		Vehicle oldFollowing = following;
		following = newFollowing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatoonPackage.FOLLOWING_VEHICLE__FOLLOWING, oldFollowing, following));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlatoonPackage.FOLLOWING_VEHICLE__FOLLOWING:
				if (resolve) return getFollowing();
				return basicGetFollowing();
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
			case PlatoonPackage.FOLLOWING_VEHICLE__FOLLOWING:
				setFollowing((Vehicle)newValue);
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
			case PlatoonPackage.FOLLOWING_VEHICLE__FOLLOWING:
				setFollowing((Vehicle)null);
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
			case PlatoonPackage.FOLLOWING_VEHICLE__FOLLOWING:
				return following != null;
		}
		return super.eIsSet(featureID);
	}

} //FollowingVehicleImpl
