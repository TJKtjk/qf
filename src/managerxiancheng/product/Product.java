package managerxiancheng.product;


/**
 * 产品类
 */
class Product {
	// 产品id
	private int id;
	// 产品名称
	private String name;

	public Product(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "(产品ID：" + id + " 产品名称：" + name + ")";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
