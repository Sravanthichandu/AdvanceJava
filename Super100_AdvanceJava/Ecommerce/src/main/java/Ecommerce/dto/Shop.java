package Ecommerce.dto;

public class Shop {
	    private int shop_id;
		private String shop_name;
		private String shop_ownername;
		private String shop_type;
		private String shop_location;
		
		public Shop(String shop_name,String shop_ownername,String shop_type,String shop_location) {
			
			this.shop_name=shop_name;
			this.shop_ownername=shop_ownername;
			this.shop_type=shop_type;
			this.shop_location=shop_location;
		}

		public String getShop_name() {
			return shop_name;
		}

		public void setShop_name(String shop_name) {
			this.shop_name = shop_name;
		}

		public String getShop_ownername() {
			return shop_ownername;
		}

		public void setShop_ownername(String shop_ownername) {
			this.shop_ownername = shop_ownername;
		}

		public String getShop_type() {
			return shop_type;
		}

		public void setShop_type(String shop_type) {
			this.shop_type = shop_type;
		}

		public String getShop_location() {
			return shop_location;
		}

		public void setShop_location(String shop_location) {
			this.shop_location = shop_location;
		}
		
	
}
