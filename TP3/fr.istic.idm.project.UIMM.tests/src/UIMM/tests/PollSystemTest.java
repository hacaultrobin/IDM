/**
 */
package UIMM.tests;

import UIMM.PollSystem;
import UIMM.UIMMFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Poll System</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PollSystemTest extends TestCase {

	/**
	 * The fixture for this Poll System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PollSystem fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PollSystemTest.class);
	}

	/**
	 * Constructs a new Poll System test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PollSystemTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Poll System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PollSystem fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Poll System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PollSystem getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UIMMFactory.eINSTANCE.createPollSystem());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //PollSystemTest
