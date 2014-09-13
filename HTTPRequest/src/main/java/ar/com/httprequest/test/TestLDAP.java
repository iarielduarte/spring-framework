package ar.com.httprequest.test;


import java.util.Random;
import com.unboundid.ldap.sdk.*;



public class TestLDAP {
	
	public static void main(String[] args)	throws Exception {
			
			LDAPConnection c = new LDAPConnection();
			
			// The LDAP directory host + port
			c.connect("localhost", 1389);
			
			
			// The directory branch where the verifications will be stored
			String dirBranch = "ou=people,dc=wonderland,dc=net";
			
			
			String email = "alice";
			
				
			// Lookup entry
			SearchResultEntry foundEntry = c.getEntry("uid=" + email + "," + dirBranch);
			
			if (foundEntry != null) {
				System.out.println("Found email address " + foundEntry.getAttribute("telephoneNumber"));
//				System.out.println("Found email address " + email);
			} else {
				System.out.println("Email address " + email + " was not found");
			}
			
			c.close();
		}

//	public static void main(String[] args)
//			throws Exception {
//			
//			LDAPConnection c = new LDAPConnection();
//			
//			// The LDAP directory host + port
//			c.connect("localhost", 1389);
//			
//			// The connection credentials
//			BindResult bindResult = c.bind("cn=Directory Manager", "secret");
//			
//			// The directory branch where the verifications will be stored
//			String dirBranch = "ou=verifications,dc=wonderland,dc=net";
//			
//			// Create directory branch
//			Entry entry = new Entry(dirBranch,
//				new Attribute("objectClass", "top"),
//				new Attribute("objectClass", "organizationalUnit"));
//				
//			try {
//				c.add(entry);
//			} catch (LDAPException e) {
//				if (! e.getResultCode().equals(ResultCode.ENTRY_ALREADY_EXISTS))
//					throw e;
//			}
//			
//			// Create random example email address to add
////			String email = "ariel.duarte@cision.com" + new Random().nextInt() + "@wonderland.net";
//			String email = "ariel.duarte@cision.com";
//			
//			// Create new LDAP directory entry (record) for email
//			entry = new Entry(
//				"uid=" + email + "," + dirBranch, 
//				new Attribute("objectClass", "top"),
//				new Attribute("objectClass", "account"));
//			
//			// Add the entry to the LDAP directory
//			LDAPResult result = c.add(entry);
//			
//			if (result.getResultCode().equals(ResultCode.SUCCESS))
//				System.out.println("Added email " + email);
//				
//			// Lookup entry
//			SearchResultEntry foundEntry = c.getEntry("uid=" + email + "," + dirBranch);
//			
//			if (foundEntry != null) {
//				System.out.println("Found email address " + email);
//			} else {
//				System.out.println("Email address " + email + " was not found");
//			}
//			
//			c.close();
//		}
	
}
