package absFactory2;

/**
 * @author tjk
 * @date 2019/8/3 19:51
 */
public abstract class BuildingFactory {
    private static final String SUPER = "Super Class";
    private static final String MEDIUM = "Medium Class";

    public abstract House getHouse();

    public abstract Condo getCondo();

    public static BuildingFactory getBuildingFactory(String type) {

        BuildingFactory bf = null;
        if (type.equals(BuildingFactory.SUPER)) {
            bf = new SuperBuildingFactory();

        } else if (type.equals(BuildingFactory.MEDIUM)) {
            bf = new MediumBuildingFactory();
        }
        return bf;
    }
}
