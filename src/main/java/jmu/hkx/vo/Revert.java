package jmu.hkx.vo;

import java.util.Date;

public class Revert {
    private Integer revertid;

    private String revertcontent;

    private String writedate;

    private Integer messageid;

    private String userid;
    
    private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getRevertid() {
        return revertid;
    }

    public void setRevertid(Integer revertid) {
        this.revertid = revertid;
    }

    public String getRevertcontent() {
        return revertcontent;
    }

    public void setRevertcontent(String revertcontent) {
        this.revertcontent = revertcontent == null ? null : revertcontent.trim();
    }

    public String getWritedate() {
        return writedate;
    }

    public void setWritedate(String writedate) {
        this.writedate = writedate;
    }

    public Integer getMessageid() {
        return messageid;
    }

    public void setMessageid(Integer messageid) {
        this.messageid = messageid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }
    
    public Revert() {
	}

	public Revert(Integer revertid, String revertcontent, String writedate, Integer messageid, String userid) {
		super();
		this.revertid = revertid;
		this.revertcontent = revertcontent;
		this.writedate = writedate;
		this.messageid = messageid;
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "Revert [revertid=" + revertid + ", revertcontent=" + revertcontent + ", writedate=" + writedate
				+ ", messageid=" + messageid + ", userid=" + userid + ", user=" + user + "]";
	}


	
}