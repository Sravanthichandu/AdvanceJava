package Ecommerce.dto;

public class Material {
		
		private String item_name;
		private String item_type;
		private int item_cost;
		private String vendor_name;

		public Material(String item_name, String item_type, int item_cost, String vendor_name) {
			super();
			this.item_name = item_name;
			this.item_type = item_type;
			this.item_cost = item_cost;
			this.vendor_name = vendor_name;
		}
		public String getItem_name() {
			return item_name;
		}
		public void setItem_name(String item_name) {
			this.item_name = item_name;
		}
		public String getItem_type() {
			return item_type;
		}
		public void setItem_type(String item_type) {
			this.item_type = item_type;
		}
		public int getItem_cost() {
			return item_cost;
		}
		public void setItem_cost(int item_cost) {
			this.item_cost = item_cost;
		}
		public String getVendor_name() {
			return vendor_name;
		}
		public void setVendor_name(String vendor_name) {
			this.vendor_name = vendor_name;
		}
		
		
}
