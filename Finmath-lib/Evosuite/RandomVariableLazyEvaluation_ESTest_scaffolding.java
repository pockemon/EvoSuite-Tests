/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Jun 21 14:54:09 GMT 2022
 */

package net.finmath.montecarlo;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class RandomVariableLazyEvaluation_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "net.finmath.montecarlo.RandomVariableLazyEvaluation"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "Cp1252"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "C:\\Users\\HARDIK~1\\AppData\\Local\\Temp\\"); 
    java.lang.System.setProperty("user.country", "IN"); 
    java.lang.System.setProperty("user.dir", "C:\\Users\\Hardik Rana\\Intellij_projects\\finmath-lib"); 
    java.lang.System.setProperty("user.home", "C:\\Users\\Hardik Rana"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "Hardik Rana"); 
    java.lang.System.setProperty("user.timezone", "Asia/Calcutta"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(RandomVariableLazyEvaluation_ESTest_scaffolding.class.getClassLoader() ,
      "net.finmath.integration.PiecewiseContantDoubleUnaryOperator",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$4",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$3",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$2",
      "org.apache.commons.math3.linear.FieldVector",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$1",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$7",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$6",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$5",
      "org.apache.commons.math3.linear.RealVector",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$9",
      "org.apache.commons.math3.exception.MathArithmeticException",
      "net.finmath.stochastic.Scalar",
      "org.apache.commons.math3.linear.FieldMatrix",
      "org.apache.commons.math3.exception.MathIllegalArgumentException",
      "org.apache.commons.math3.exception.ZeroException",
      "org.apache.commons.math3.linear.Array2DRowFieldMatrix",
      "org.apache.commons.math3.util.FastMath",
      "net.finmath.stochastic.ConditionalExpectationEstimator",
      "net.finmath.stochastic.RandomVariableArrayImplementation",
      "org.apache.commons.math3.linear.RealMatrix",
      "org.apache.commons.math3.exception.NotFiniteNumberException",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$11",
      "org.apache.commons.math3.exception.util.ExceptionContextProvider",
      "org.apache.commons.math3.linear.BlockRealMatrix",
      "net.finmath.stochastic.RandomVariableArray",
      "org.apache.commons.math3.linear.BlockFieldMatrix",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation",
      "org.apache.commons.math3.exception.NumberIsTooSmallException",
      "org.apache.commons.math3.exception.MathIllegalStateException",
      "net.finmath.stochastic.RandomVariable",
      "org.apache.commons.math3.linear.NonSquareMatrixException",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$18",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$19",
      "org.apache.commons.math3.linear.MatrixUtils",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$16",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$17",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$14",
      "org.apache.commons.math3.linear.NonSymmetricMatrixException",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$15",
      "org.apache.commons.math3.linear.Array2DRowRealMatrix",
      "org.apache.commons.math3.util.MathUtils",
      "org.apache.commons.math3.util.CompositeFormat",
      "org.apache.commons.math3.linear.AbstractRealMatrix",
      "org.apache.commons.math3.exception.MathParseException",
      "org.apache.commons.math3.exception.DimensionMismatchException",
      "net.finmath.interpolation.RationalFunctionInterpolation$1",
      "org.apache.commons.lang3.Validate",
      "net.finmath.stochastic.RandomOperator",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$34",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$35",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$32",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$33",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$30",
      "net.finmath.functions.LinearAlgebra",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$31",
      "net.finmath.interpolation.RationalFunctionInterpolation",
      "org.apache.commons.math3.exception.OutOfRangeException",
      "org.apache.commons.math3.exception.NotPositiveException",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$38",
      "org.apache.commons.math3.linear.ArrayRealVector",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$39",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$36",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$37",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$24",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$21",
      "org.apache.commons.math3.linear.RealMatrixFormat",
      "org.apache.commons.math3.linear.AbstractFieldMatrix",
      "net.finmath.interpolation.RationalFunctionInterpolation$RationalFunction",
      "org.apache.commons.math3.exception.NotStrictlyPositiveException",
      "org.apache.commons.math3.exception.NoDataException",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$29",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$27",
      "org.apache.commons.math3.linear.RealLinearOperator",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$28",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$25",
      "org.apache.commons.math3.linear.RealMatrixPreservingVisitor",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$52",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$50",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$51",
      "org.apache.commons.lang3.ArrayUtils",
      "org.apache.commons.math3.linear.SingularMatrixException",
      "net.finmath.functions.DoubleTernaryOperator",
      "org.apache.commons.math3.linear.MatrixDimensionMismatchException",
      "org.apache.commons.math3.linear.FieldMatrixPreservingVisitor",
      "org.apache.commons.math3.linear.DecompositionSolver",
      "org.apache.commons.math3.linear.LUDecomposition$Solver",
      "org.apache.commons.math3.exception.MultiDimensionMismatchException",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$45",
      "net.finmath.montecarlo.RandomVariableFromDoubleArray",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$46",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$43",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$44",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$41",
      "org.apache.commons.math3.exception.MathIllegalNumberException",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$42",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$40",
      "org.apache.commons.math3.linear.AnyMatrix",
      "net.finmath.interpolation.RationalFunctionInterpolation$ExtrapolationMethod",
      "org.apache.commons.math3.exception.util.Localizable",
      "org.apache.commons.math3.linear.LUDecomposition",
      "org.apache.commons.math3.exception.NullArgumentException",
      "net.finmath.interpolation.RationalFunctionInterpolation$InterpolationMethod",
      "org.apache.commons.math3.linear.RealMatrixChangingVisitor",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$49",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$47",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$48"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.util.function.DoubleBinaryOperator", false, RandomVariableLazyEvaluation_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("net.finmath.functions.DoubleTernaryOperator", false, RandomVariableLazyEvaluation_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(RandomVariableLazyEvaluation_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "net.finmath.montecarlo.RandomVariableLazyEvaluation",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$1",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$2",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$3",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$4",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$6",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$5",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$7",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$9",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$11",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$14",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$15",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$16",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$17",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$18",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$19",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$20",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$21",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$22",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$23",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$24",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$25",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$26",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$27",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$28",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$29",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$30",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$31",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$32",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$33",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$34",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$35",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$36",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$37",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$38",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$39",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$40",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$41",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$42",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$43",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$44",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$45",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$46",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$47",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$48",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$49",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$50",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$51",
      "net.finmath.montecarlo.RandomVariableLazyEvaluation$52",
      "net.finmath.montecarlo.RandomVariableFromDoubleArray",
      "net.finmath.stochastic.Scalar",
      "net.finmath.integration.PiecewiseContantDoubleUnaryOperator",
      "net.finmath.stochastic.RandomVariableArrayImplementation",
      "net.finmath.interpolation.RationalFunctionInterpolation",
      "net.finmath.interpolation.RationalFunctionInterpolation$1",
      "net.finmath.interpolation.RationalFunctionInterpolation$RationalFunction",
      "org.apache.commons.lang3.ArrayUtils",
      "org.apache.commons.lang3.Validate",
      "net.finmath.montecarlo.conditionalexpectation.MonteCarloConditionalExpectationRegression",
      "net.finmath.montecarlo.conditionalexpectation.MonteCarloConditionalExpectationRegression$RegressionBasisFunctionsGiven",
      "org.apache.commons.math3.linear.SingularValueDecomposition",
      "org.apache.commons.math3.linear.RealLinearOperator",
      "org.apache.commons.math3.linear.RealMatrixFormat",
      "org.apache.commons.math3.util.CompositeFormat",
      "org.apache.commons.math3.linear.AbstractRealMatrix",
      "org.apache.commons.math3.linear.Array2DRowRealMatrix",
      "org.apache.commons.math3.util.FastMath",
      "org.apache.commons.math3.util.Precision",
      "org.apache.commons.math3.linear.MatrixUtils",
      "org.apache.commons.math3.util.MathUtils",
      "org.apache.commons.math3.linear.SingularValueDecomposition$Solver",
      "org.apache.commons.math3.linear.DefaultRealMatrixPreservingVisitor",
      "org.apache.commons.math3.linear.AbstractRealMatrix$5",
      "org.apache.commons.math3.linear.RealVector",
      "org.apache.commons.math3.linear.RealVectorFormat",
      "org.apache.commons.math3.linear.ArrayRealVector",
      "net.finmath.montecarlo.conditionalexpectation.MonteCarloConditionalExpectationRegressionLocalizedOnDependents",
      "net.finmath.stochastic.RandomVariableArrayImplementation$22",
      "net.finmath.stochastic.RandomVariableArrayImplementation$7",
      "net.finmath.stochastic.RandomVariableArrayImplementation$8",
      "org.apache.commons.math3.exception.MathIllegalArgumentException",
      "org.apache.commons.math3.exception.NoDataException",
      "org.apache.commons.math3.exception.util.LocalizedFormats",
      "org.apache.commons.math3.exception.util.ExceptionContext",
      "org.apache.commons.math3.exception.util.ArgUtils",
      "net.finmath.functions.LinearAlgebra",
      "org.apache.commons.math3.linear.LUDecomposition",
      "org.apache.commons.math3.linear.LUDecomposition$Solver",
      "net.finmath.stochastic.RandomVariableArrayImplementation$29",
      "net.finmath.stochastic.RandomVariableArrayImplementation$5"
    );
  }
}
