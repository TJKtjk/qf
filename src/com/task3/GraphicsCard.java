package com.task3;

/**
 * @author tjk
 * @date 2019/7/31 20:05
 */
public   class GraphicsCard {

    /**
     * 显卡品牌
     */
    private String graphicsCardType;
    /**
     * 显卡售价
     */

    private int graphicsCardPrice;
    /**
     * 显卡分辨率
     */
    private int resolutionRatio;

    public void renderGraphics(){
        System.out.println("渲染图形");
    }


    public int getResolutionRatio() {
        return resolutionRatio;
    }

    public void setResolutionRatio(int resolutionRatio) {
        this.resolutionRatio = resolutionRatio;
    }

    public int getGraphicsCardPrice() {
        return graphicsCardPrice;
    }

    public void setGraphicsCardPrice(int graphicsCardPrice) {
        this.graphicsCardPrice = graphicsCardPrice;
    }

    public String getGraphicsCardType() {
        return graphicsCardType;
    }

    public void setGraphicsCardType(String graphicsCardType) {
        this.graphicsCardType = graphicsCardType;
    }


    @Override
    public String toString() {
        return "GraphicsCard{" +
                "graphicsCardType='" + graphicsCardType + '\'' +
                ", graphicsCardPrice=" + graphicsCardPrice +
                ", resolutionRatio='" + resolutionRatio + '\'' +
                '}';
    }
}
