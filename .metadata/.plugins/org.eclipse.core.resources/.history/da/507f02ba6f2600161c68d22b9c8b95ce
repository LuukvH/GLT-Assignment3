/**
 */
package platoon.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import platoon.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlatoonFactoryImpl extends EFactoryImpl implements PlatoonFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PlatoonFactory init() {
		try {
			PlatoonFactory thePlatoonFactory = (PlatoonFactory)EPackage.Registry.INSTANCE.getEFactory(PlatoonPackage.eNS_URI);
			if (thePlatoonFactory != null) {
				return thePlatoonFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PlatoonFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatoonFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PlatoonPackage.PLATOON: return createPlatoon();
			case PlatoonPackage.ROUTE: return createRoute();
			case PlatoonPackage.CONSTRAINTS: return createConstraints();
			case PlatoonPackage.TURN_LEFT: return createTurnLeft();
			case PlatoonPackage.TURN_RIGHT: return createTurnRight();
			case PlatoonPackage.FORWARD: return createForward();
			case PlatoonPackage.FOLLOWING_VEHICLE: return createFollowingVehicle();
			case PlatoonPackage.LEADER_VEHICLE: return createLeaderVehicle();
			case PlatoonPackage.ROOT: return createRoot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Platoon createPlatoon() {
		PlatoonImpl platoon = new PlatoonImpl();
		return platoon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Route createRoute() {
		RouteImpl route = new RouteImpl();
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraints createConstraints() {
		ConstraintsImpl constraints = new ConstraintsImpl();
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnLeft createTurnLeft() {
		TurnLeftImpl turnLeft = new TurnLeftImpl();
		return turnLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnRight createTurnRight() {
		TurnRightImpl turnRight = new TurnRightImpl();
		return turnRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Forward createForward() {
		ForwardImpl forward = new ForwardImpl();
		return forward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FollowingVehicle createFollowingVehicle() {
		FollowingVehicleImpl followingVehicle = new FollowingVehicleImpl();
		return followingVehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeaderVehicle createLeaderVehicle() {
		LeaderVehicleImpl leaderVehicle = new LeaderVehicleImpl();
		return leaderVehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root createRoot() {
		RootImpl root = new RootImpl();
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatoonPackage getPlatoonPackage() {
		return (PlatoonPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PlatoonPackage getPackage() {
		return PlatoonPackage.eINSTANCE;
	}

} //PlatoonFactoryImpl
