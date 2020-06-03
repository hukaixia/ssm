package jmu.hkx.vo;

import java.math.BigDecimal;

public class Product {
    private Integer productid;

    private String productname;

    private String productbrand;

    private String productmodel;

    private BigDecimal productprice;

    private String productimage;

    private String productdes;

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public String getProductbrand() {
        return productbrand;
    }

    public void setProductbrand(String productbrand) {
        this.productbrand = productbrand == null ? null : productbrand.trim();
    }

    public String getProductmodel() {
        return productmodel;
    }

    public void setProductmodel(String productmodel) {
        this.productmodel = productmodel == null ? null : productmodel.trim();
    }

    public BigDecimal getProductprice() {
        return productprice;
    }

    public void setProductprice(BigDecimal productprice) {
        this.productprice = productprice;
    }

    public String getProductimage() {
        return productimage;
    }

    public void setProductimage(String productimage) {
        this.productimage = productimage == null ? null : productimage.trim();
    }

    public String getProductdes() {
        return productdes;
    }

    public void setProductdes(String productdes) {
        this.productdes = productdes == null ? null : productdes.trim();
    }

	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productname=" + productname + ", productbrand=" + productbrand
				+ ", productmodel=" + productmodel + ", productprice=" + productprice + ", productimage=" + productimage
				+ ", productdes=" + productdes + "]";
	}

	public Product(String productname, String productbrand, String productmodel, BigDecimal productprice,
			String productimage, String productdes) {
		super();
		this.productname = productname;
		this.productbrand = productbrand;
		this.productmodel = productmodel;
		this.productprice = productprice;
		this.productimage = productimage;
		this.productdes = productdes;
	}

	public Product() {
	}
    
}