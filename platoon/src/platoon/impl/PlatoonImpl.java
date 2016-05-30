/**
 */
package platoon.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import platoon.FollowingVehicle;
import platoon.LeaderVehicle;
import platoon.Platoon;
import platoon.PlatoonPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Platoon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link platoon.impl.PlatoonImpl#getLeaderVehicle <em>Leader Vehicle</em>}</li>
 *   <li>{@link platoon.impl.PlatoonImpl#getFollowingVehicle <em>Following Vehicle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlatoonImpl extends MinimalEObjectImpl.Container implements Platoon {
	/**
	 * The cached value of the '{@link #getLeaderVehicle() <em>Leader Vehicle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaderVehicle()
	 * @generated
	 * @ordered
	 */
	protected LeaderVehicle leaderVehicle;

	/**
	 * The cached value of the '{@link #getFollowingVehicle() <em>Following Vehicle</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowingVehicle()
	 * @generated
	 * @ordered
	 */
	protected EList<FollowingVehicle> followingVehicle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlatoonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatoonPackage.Literals.PLATOON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeaderVehicle getLeaderVehicle() {
		if (leaderVehicle != null && leaderVehicle.eIsProxy()) {
			InternalEObject oldLeaderVehicle = (InternalEObject)leaderVehicle;
			leaderVehicle = (LeaderVehicle)eResolveProxy(oldLeaderVehicle);
			if (leaderVehicle != oldLeaderVehicle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlatoonPackage.PLATOON__LEADER_VEHICLE, oldLeaderVehicle, leaderVehicle));
			}
		}
		return leaderVehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeaderVehicle basicGetLeaderVehicle() {
		return leaderVehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeaderVehicle(LeaderVehicle newLeaderVehicle) {
		LeaderVehicle oldLeaderVehicle = leaderVehicle;
		leaderVehicle = newLeaderVehicle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatoonPackage.PLATOON__LEADER_VEHICLE, oldLeaderVehicle, leaderVehicle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FollowingVehicle> getFollowingVehicle() {
		if (followingVehicle == null) {
			followingVehicle = new EObjectResolvingEList<FollowingVehicle>(FollowingVehicle.class, this, PlatoonPackage.PLATOON__FOLLOWING_VEHICLE);
		}
		return followingVehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlatoonPackage.PLATOON__LEADER_VEHICLE:
				if (resolve) return getLeaderVehicle();
				return basicGetLeaderVehicle();
			case PlatoonPackage.PLATOON__FOLLOWING_VEHICLE:
				return getFollowingVehicle();
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
			case PlatoonPackage.PLATOON__LEADER_VEHICLE:
				setLeaderVehicle((LeaderVehicle)newValue);
				return;
			case PlatoonPackage.PLATOON__FOLLOWING_VEHICLE:
				getFollowingVehicle().clear();
				getFollowingVehicle().addAll((Collection<? extends FollowingVehicle>)newValue);
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
			case PlatoonPackage.PLATOON__LEADER_VEHICLE:
				setLeaderVehicle((LeaderVehicle)null);
				return;
			case PlatoonPackage.PLATOON__FOLLOWING_VEHICLE:
				getFollowingVehicle().clear();
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
			case PlatoonPackage.PLATOON__LEADER_VEHICLE:
				return leaderVehicle != null;
			case PlatoonPackage.PLATOON__FOLLOWING_VEHICLE:
				return followingVehicle != null && !followingVehicle.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PlatoonImpl
