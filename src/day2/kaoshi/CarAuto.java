package day2.kaoshi;

/**
 * @author tjk
 * @date 2019/8/2 16:54
 */
public class CarAuto extends Auto {

    private String airConditioner;
    private String cd;

    public String getAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(String airConditioner) {
        this.airConditioner = airConditioner;
    }

    public String getCd() {
        return cd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    @Override
    public void speedUp() {
        System.out.println("踩油门加油");

    }

    @Override
    public void slowDown() {

    }

    @Override
    public void stop() {
        System.out.println("踩刹车停车");

    }
}
