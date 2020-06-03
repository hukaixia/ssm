package jmu.hkx.vo;

import java.util.Date;

public class Message {
    private Integer messageid;

    private String messagecontent;

    private String writedate;

    private Integer count;

    private Integer productid;

    private String userid;
    private User user;

    @Override
	public String toString() {
		return "Message [messageid=" + messageid + ", messagecontent=" + messagecontent + ", writedate=" + writedate
				+ ", count=" + count + ", productid=" + productid + ", userid=" + userid + ", user=" + user + "]";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getMessageid() {
        return messageid;
    }

    public void setMessageid(Integer messageid) {
        this.messageid = messageid;
    }

    public String getMessagecontent() {
        return messagecontent;
    }

    public void setMessagecontent(String messagecontent) {
        this.messagecontent = messagecontent == null ? null : messagecontent.trim();
    }

    public String getWritedate() {
        return writedate;
    }

    public void setWritedate(String writedate) {
        this.writedate = writedate;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

	public Message(Integer messageid, String messagecontent, String writedate, Integer count, Integer productid,
			String userid) {
		super();
		this.messageid = messageid;
		this.messagecontent = messagecontent;
		this.writedate = writedate;
		this.count = count;
		this.productid = productid;
		this.userid = userid;
	}

	public Message() {
	}
    
}