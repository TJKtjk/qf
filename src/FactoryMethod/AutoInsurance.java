package FactoryMethod;

/**
 * @author tjk
 * @date 2019/8/3 19:05
 */

/**
 * public interface AutoInsurance {
 *     abstract String getInsuranceDescription();
 * }
 * public class BodyInjurLiability implements AutoInsurance { ... }
 * public class CollisionCoverage implements AutoInsurance { ... }
 * public class ComprehensiveCoverage implements AutoInsurance { ... }
 * public class PersonalInjuryProtection implements AutoInsurance { ... }
 */
public interface AutoInsurance {
    abstract String getInsuranceDescription();

}
