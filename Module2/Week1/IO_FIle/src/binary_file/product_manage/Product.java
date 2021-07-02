package binary_file.product_manage;


import java.io.Serializable;

class Product implements Serializable {
        private int ID;
        private String NameProduct;
        private String Manufacturer;
        private long PriceProduct;

        public Product() {

        }

        public Product(int ID, String nameProduct, String Manufacturer, int PriceProduct) {
            this.ID = ID;
            NameProduct = nameProduct;
            this.Manufacturer = Manufacturer;
            this.PriceProduct = PriceProduct;
        }

        public void setID(int ID){
            this.ID = ID;

        }

        public int getID(){
            return ID;
        }

        public void setNameProduct(String NameProduct){
            this.NameProduct = NameProduct;
        }

        public String getNameProduct(){
            return  NameProduct;
        }

        public void setManufacturer(String Manufacturer){
            this.Manufacturer = Manufacturer;
        }

        public String getManufacturer(){
            return Manufacturer;
        }

        public void setPriceProduct(int PriceProduct){
            this.PriceProduct = PriceProduct;
        }

        public long getPriceProduct(){
            return PriceProduct;
        }

        @Override
        public String toString(){
            return "Product: {" +
                    "id: " + getID() +
                    "name: " + getNameProduct() +
                    "manufacturer: " + getManufacturer() +
                    "price: " + getPriceProduct() + "}";
        }

    }

