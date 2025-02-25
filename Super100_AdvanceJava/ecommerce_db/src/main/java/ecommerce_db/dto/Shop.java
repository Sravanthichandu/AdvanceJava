package ecommerce_db.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Shop {

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private int shop_Id;
	private String shop_name;
	private String shop_location;
	private String vendor_name;
	public Shop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Shop( int shop_Id,String shop_name, String shop_location, String vendor_name) {
		super();
		this.shop_Id=shop_Id;
		this.shop_name = shop_name;
		this.shop_location = shop_location;
		this.vendor_name = vendor_name;
	}
	public int getShop_Id() {
		return shop_Id;
	}
	public void setShop_Id(int shop_Id)
	{
		this.shop_Id=shop_Id;
	}
	public String getShop_name() {
		return shop_name;
	}
	public void setShop_name(String shop_name) {
		this.shop_name = shop_name;
	}
	public String getShop_location() {
		return shop_location;
	}
	public void setShop_location(String shop_location) {
		this.shop_location = shop_location;
	}
	public String getVendor_name() {
		return vendor_name;
	}
	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}
	@Override
	public String toString() {
		return "Shop [shop_Id=" + shop_Id + ", shop_name=" + shop_name + ", shop_location=" + shop_location
				+ ", vendor_name=" + vendor_name + "]";
	}
	
	
}
