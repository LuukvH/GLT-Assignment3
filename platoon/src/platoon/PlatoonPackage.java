/**
 */
package platoon;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see platoon.PlatoonFactory
 * @model kind="package"
 * @generated
 */
public interface PlatoonPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "platoon";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platoon";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "platoon";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PlatoonPackage eINSTANCE = platoon.impl.PlatoonPackageImpl.init();

	/**
	 * The meta object id for the '{@link platoon.impl.PlatoonImpl <em>Platoon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platoon.impl.PlatoonImpl
	 * @see platoon.impl.PlatoonPackageImpl#getPlatoon()
	 * @generated
	 */
	int PLATOON = 0;

	/**
	 * The feature id for the '<em><b>Leader Vehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATOON__LEADER_VEHICLE = 0;

	/**
	 * The feature id for the '<em><b>Following Vehicle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATOON__FOLLOWING_VEHICLE = 1;

	/**
	 * The number of structural features of the '<em>Platoon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATOON_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Platoon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATOON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link platoon.impl.RouteImpl <em>Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platoon.impl.RouteImpl
	 * @see platoon.impl.PlatoonPackageImpl#getRoute()
	 * @generated
	 */
	int ROUTE = 1;

	/**
	 * The feature id for the '<em><b>Route Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__ROUTE_COMMANDS = 0;

	/**
	 * The number of structural features of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link platoon.impl.ConstraintsImpl <em>Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platoon.impl.ConstraintsImpl
	 * @see platoon.impl.PlatoonPackageImpl#getConstraints()
	 * @generated
	 */
	int CONSTRAINTS = 2;

	/**
	 * The feature id for the '<em><b>Lbound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS__LBOUND = 0;

	/**
	 * The feature id for the '<em><b>Ubound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS__UBOUND = 1;

	/**
	 * The number of structural features of the '<em>Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link platoon.impl.routeCommandImpl <em>route Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platoon.impl.routeCommandImpl
	 * @see platoon.impl.PlatoonPackageImpl#getrouteCommand()
	 * @generated
	 */
	int ROUTE_COMMAND = 6;

	/**
	 * The number of structural features of the '<em>route Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_COMMAND_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>route Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link platoon.impl.TurnLeftImpl <em>Turn Left</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platoon.impl.TurnLeftImpl
	 * @see platoon.impl.PlatoonPackageImpl#getTurnLeft()
	 * @generated
	 */
	int TURN_LEFT = 3;

	/**
	 * The number of structural features of the '<em>Turn Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_LEFT_FEATURE_COUNT = ROUTE_COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Turn Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_LEFT_OPERATION_COUNT = ROUTE_COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link platoon.impl.TurnRightImpl <em>Turn Right</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platoon.impl.TurnRightImpl
	 * @see platoon.impl.PlatoonPackageImpl#getTurnRight()
	 * @generated
	 */
	int TURN_RIGHT = 4;

	/**
	 * The number of structural features of the '<em>Turn Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_RIGHT_FEATURE_COUNT = ROUTE_COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Turn Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_RIGHT_OPERATION_COUNT = ROUTE_COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link platoon.impl.ForwardImpl <em>Forward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platoon.impl.ForwardImpl
	 * @see platoon.impl.PlatoonPackageImpl#getForward()
	 * @generated
	 */
	int FORWARD = 5;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD__DISTANCE = ROUTE_COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_FEATURE_COUNT = ROUTE_COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_OPERATION_COUNT = ROUTE_COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link platoon.impl.VehicleImpl <em>Vehicle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platoon.impl.VehicleImpl
	 * @see platoon.impl.PlatoonPackageImpl#getVehicle()
	 * @generated
	 */
	int VEHICLE = 7;

	/**
	 * The number of structural features of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link platoon.impl.FollowingVehicleImpl <em>Following Vehicle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platoon.impl.FollowingVehicleImpl
	 * @see platoon.impl.PlatoonPackageImpl#getFollowingVehicle()
	 * @generated
	 */
	int FOLLOWING_VEHICLE = 8;

	/**
	 * The feature id for the '<em><b>Following</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLLOWING_VEHICLE__FOLLOWING = VEHICLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Following Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLLOWING_VEHICLE_FEATURE_COUNT = VEHICLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Following Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLLOWING_VEHICLE_OPERATION_COUNT = VEHICLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link platoon.impl.LeaderVehicleImpl <em>Leader Vehicle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platoon.impl.LeaderVehicleImpl
	 * @see platoon.impl.PlatoonPackageImpl#getLeaderVehicle()
	 * @generated
	 */
	int LEADER_VEHICLE = 9;

	/**
	 * The feature id for the '<em><b>Route</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADER_VEHICLE__ROUTE = VEHICLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Leader Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADER_VEHICLE_FEATURE_COUNT = VEHICLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Leader Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADER_VEHICLE_OPERATION_COUNT = VEHICLE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link platoon.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platoon.impl.RootImpl
	 * @see platoon.impl.PlatoonPackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 10;

	/**
	 * The feature id for the '<em><b>Platoon</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__PLATOON = 0;

	/**
	 * The feature id for the '<em><b>Route</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__ROUTE = 1;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__CONSTRAINTS = 2;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link platoon.Platoon <em>Platoon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platoon</em>'.
	 * @see platoon.Platoon
	 * @generated
	 */
	EClass getPlatoon();

	/**
	 * Returns the meta object for the reference '{@link platoon.Platoon#getLeaderVehicle <em>Leader Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Leader Vehicle</em>'.
	 * @see platoon.Platoon#getLeaderVehicle()
	 * @see #getPlatoon()
	 * @generated
	 */
	EReference getPlatoon_LeaderVehicle();

	/**
	 * Returns the meta object for the reference list '{@link platoon.Platoon#getFollowingVehicle <em>Following Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Following Vehicle</em>'.
	 * @see platoon.Platoon#getFollowingVehicle()
	 * @see #getPlatoon()
	 * @generated
	 */
	EReference getPlatoon_FollowingVehicle();

	/**
	 * Returns the meta object for class '{@link platoon.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route</em>'.
	 * @see platoon.Route
	 * @generated
	 */
	EClass getRoute();

	/**
	 * Returns the meta object for the containment reference list '{@link platoon.Route#getRouteCommands <em>Route Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Route Commands</em>'.
	 * @see platoon.Route#getRouteCommands()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_RouteCommands();

	/**
	 * Returns the meta object for class '{@link platoon.Constraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraints</em>'.
	 * @see platoon.Constraints
	 * @generated
	 */
	EClass getConstraints();

	/**
	 * Returns the meta object for the attribute '{@link platoon.Constraints#getLbound <em>Lbound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lbound</em>'.
	 * @see platoon.Constraints#getLbound()
	 * @see #getConstraints()
	 * @generated
	 */
	EAttribute getConstraints_Lbound();

	/**
	 * Returns the meta object for the attribute '{@link platoon.Constraints#getUbound <em>Ubound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ubound</em>'.
	 * @see platoon.Constraints#getUbound()
	 * @see #getConstraints()
	 * @generated
	 */
	EAttribute getConstraints_Ubound();

	/**
	 * Returns the meta object for class '{@link platoon.TurnLeft <em>Turn Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn Left</em>'.
	 * @see platoon.TurnLeft
	 * @generated
	 */
	EClass getTurnLeft();

	/**
	 * Returns the meta object for class '{@link platoon.TurnRight <em>Turn Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn Right</em>'.
	 * @see platoon.TurnRight
	 * @generated
	 */
	EClass getTurnRight();

	/**
	 * Returns the meta object for class '{@link platoon.Forward <em>Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forward</em>'.
	 * @see platoon.Forward
	 * @generated
	 */
	EClass getForward();

	/**
	 * Returns the meta object for the attribute list '{@link platoon.Forward#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Distance</em>'.
	 * @see platoon.Forward#getDistance()
	 * @see #getForward()
	 * @generated
	 */
	EAttribute getForward_Distance();

	/**
	 * Returns the meta object for class '{@link platoon.routeCommand <em>route Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>route Command</em>'.
	 * @see platoon.routeCommand
	 * @generated
	 */
	EClass getrouteCommand();

	/**
	 * Returns the meta object for class '{@link platoon.Vehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle</em>'.
	 * @see platoon.Vehicle
	 * @generated
	 */
	EClass getVehicle();

	/**
	 * Returns the meta object for class '{@link platoon.FollowingVehicle <em>Following Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Following Vehicle</em>'.
	 * @see platoon.FollowingVehicle
	 * @generated
	 */
	EClass getFollowingVehicle();

	/**
	 * Returns the meta object for the reference '{@link platoon.FollowingVehicle#getFollowing <em>Following</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Following</em>'.
	 * @see platoon.FollowingVehicle#getFollowing()
	 * @see #getFollowingVehicle()
	 * @generated
	 */
	EReference getFollowingVehicle_Following();

	/**
	 * Returns the meta object for class '{@link platoon.LeaderVehicle <em>Leader Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leader Vehicle</em>'.
	 * @see platoon.LeaderVehicle
	 * @generated
	 */
	EClass getLeaderVehicle();

	/**
	 * Returns the meta object for the reference '{@link platoon.LeaderVehicle#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Route</em>'.
	 * @see platoon.LeaderVehicle#getRoute()
	 * @see #getLeaderVehicle()
	 * @generated
	 */
	EReference getLeaderVehicle_Route();

	/**
	 * Returns the meta object for class '{@link platoon.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see platoon.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the reference '{@link platoon.Root#getPlatoon <em>Platoon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Platoon</em>'.
	 * @see platoon.Root#getPlatoon()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Platoon();

	/**
	 * Returns the meta object for the reference '{@link platoon.Root#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Route</em>'.
	 * @see platoon.Root#getRoute()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Route();

	/**
	 * Returns the meta object for the reference '{@link platoon.Root#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constraints</em>'.
	 * @see platoon.Root#getConstraints()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Constraints();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PlatoonFactory getPlatoonFactory();

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
		 * The meta object literal for the '{@link platoon.impl.PlatoonImpl <em>Platoon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platoon.impl.PlatoonImpl
		 * @see platoon.impl.PlatoonPackageImpl#getPlatoon()
		 * @generated
		 */
		EClass PLATOON = eINSTANCE.getPlatoon();

		/**
		 * The meta object literal for the '<em><b>Leader Vehicle</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATOON__LEADER_VEHICLE = eINSTANCE.getPlatoon_LeaderVehicle();

		/**
		 * The meta object literal for the '<em><b>Following Vehicle</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATOON__FOLLOWING_VEHICLE = eINSTANCE.getPlatoon_FollowingVehicle();

		/**
		 * The meta object literal for the '{@link platoon.impl.RouteImpl <em>Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platoon.impl.RouteImpl
		 * @see platoon.impl.PlatoonPackageImpl#getRoute()
		 * @generated
		 */
		EClass ROUTE = eINSTANCE.getRoute();

		/**
		 * The meta object literal for the '<em><b>Route Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__ROUTE_COMMANDS = eINSTANCE.getRoute_RouteCommands();

		/**
		 * The meta object literal for the '{@link platoon.impl.ConstraintsImpl <em>Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platoon.impl.ConstraintsImpl
		 * @see platoon.impl.PlatoonPackageImpl#getConstraints()
		 * @generated
		 */
		EClass CONSTRAINTS = eINSTANCE.getConstraints();

		/**
		 * The meta object literal for the '<em><b>Lbound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINTS__LBOUND = eINSTANCE.getConstraints_Lbound();

		/**
		 * The meta object literal for the '<em><b>Ubound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINTS__UBOUND = eINSTANCE.getConstraints_Ubound();

		/**
		 * The meta object literal for the '{@link platoon.impl.TurnLeftImpl <em>Turn Left</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platoon.impl.TurnLeftImpl
		 * @see platoon.impl.PlatoonPackageImpl#getTurnLeft()
		 * @generated
		 */
		EClass TURN_LEFT = eINSTANCE.getTurnLeft();

		/**
		 * The meta object literal for the '{@link platoon.impl.TurnRightImpl <em>Turn Right</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platoon.impl.TurnRightImpl
		 * @see platoon.impl.PlatoonPackageImpl#getTurnRight()
		 * @generated
		 */
		EClass TURN_RIGHT = eINSTANCE.getTurnRight();

		/**
		 * The meta object literal for the '{@link platoon.impl.ForwardImpl <em>Forward</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platoon.impl.ForwardImpl
		 * @see platoon.impl.PlatoonPackageImpl#getForward()
		 * @generated
		 */
		EClass FORWARD = eINSTANCE.getForward();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORWARD__DISTANCE = eINSTANCE.getForward_Distance();

		/**
		 * The meta object literal for the '{@link platoon.impl.routeCommandImpl <em>route Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platoon.impl.routeCommandImpl
		 * @see platoon.impl.PlatoonPackageImpl#getrouteCommand()
		 * @generated
		 */
		EClass ROUTE_COMMAND = eINSTANCE.getrouteCommand();

		/**
		 * The meta object literal for the '{@link platoon.impl.VehicleImpl <em>Vehicle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platoon.impl.VehicleImpl
		 * @see platoon.impl.PlatoonPackageImpl#getVehicle()
		 * @generated
		 */
		EClass VEHICLE = eINSTANCE.getVehicle();

		/**
		 * The meta object literal for the '{@link platoon.impl.FollowingVehicleImpl <em>Following Vehicle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platoon.impl.FollowingVehicleImpl
		 * @see platoon.impl.PlatoonPackageImpl#getFollowingVehicle()
		 * @generated
		 */
		EClass FOLLOWING_VEHICLE = eINSTANCE.getFollowingVehicle();

		/**
		 * The meta object literal for the '<em><b>Following</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLLOWING_VEHICLE__FOLLOWING = eINSTANCE.getFollowingVehicle_Following();

		/**
		 * The meta object literal for the '{@link platoon.impl.LeaderVehicleImpl <em>Leader Vehicle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platoon.impl.LeaderVehicleImpl
		 * @see platoon.impl.PlatoonPackageImpl#getLeaderVehicle()
		 * @generated
		 */
		EClass LEADER_VEHICLE = eINSTANCE.getLeaderVehicle();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEADER_VEHICLE__ROUTE = eINSTANCE.getLeaderVehicle_Route();

		/**
		 * The meta object literal for the '{@link platoon.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platoon.impl.RootImpl
		 * @see platoon.impl.PlatoonPackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Platoon</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__PLATOON = eINSTANCE.getRoot_Platoon();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__ROUTE = eINSTANCE.getRoot_Route();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__CONSTRAINTS = eINSTANCE.getRoot_Constraints();

	}

} //PlatoonPackage
