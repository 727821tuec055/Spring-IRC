package com.example.project1.Model;

	import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cycleshowroom")
public class CycleModel {
@Id

         private int cid;
         private String cname;
         private int cnum;
         private  String caddress;
         private String cphone;
         private String cemail;
         private String cyclename;
         private int cycleamount;
         private String cddate;
         private String cpay;
		public int getCid() {
			return cid;
		}
		public void setCid(int cid) {
			this.cid = cid;
		}
		public String getCname() {
			return cname;
		}
		public void setCname(String cname) {
			this.cname = cname;
		}
		public int getCnum() {
			return cnum;
		}
		public void setCnum(int cnum) {
			this.cnum = cnum;
		}
		public String getCaddress() {
			return caddress;
		}
		public void setCaddress(String caddress) {
			this.caddress = caddress;
		}
		public String getCphone() {
			return cphone;
		}
		public void setCphone(String cphone) {
			this.cphone = cphone;
		}
		public String getCemail() {
			return cemail;
		}
		public void setCemail(String cemail) {
			this.cemail = cemail;
		}
		public String getCyclename() {
			return cyclename;
		}
		public void setCyclename(String cyclename) {
			this.cyclename = cyclename;
		}
		public int getCycleamount() {
			return cycleamount;
		}
		public void setCycleamount(int cycleamount) {
			this.cycleamount = cycleamount;
		}
		public String getCddate() {
			return cddate;
		}
		public void setCddate(String cddate) {
			this.cddate = cddate;
		}
		public String getCpay() {
			return cpay;
		}
		public void setCpay(String cpay) {
			this.cpay = cpay;
		}
         
}
