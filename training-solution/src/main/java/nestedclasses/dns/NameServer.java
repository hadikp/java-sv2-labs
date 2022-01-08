package nestedclasses.dns;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NameServer {

    private List<DnsEntry> dnsEntries = new ArrayList<>();

    public void addEntry(String hostName, String hostIp) {
        if (isContainByName(hostName) || isContainByIp(hostIp)) {
            throw new IllegalArgumentException("Already exists");
        } else {
            dnsEntries.add(new DnsEntry(hostName, hostIp));
        }
    }

    public void removeEntryByName(String hostName) {
        if (isContainByName(hostName)) {
            Iterator<DnsEntry> iterator = dnsEntries.iterator();
            while (iterator.hasNext()) {
                DnsEntry value = iterator.next();
                if (value.hostName.equals(hostName)) {
                    iterator.remove();
                }
            }
        } else {
            throw new IllegalArgumentException("Element not found");
        }
    }

    public void removeEntryByIp(String hostIP) {
        if (isContainByIp(hostIP)) {
            Iterator<DnsEntry> iterator = dnsEntries.iterator();
            while (iterator.hasNext()) {
                DnsEntry value = iterator.next();
                if(value.hostIP.equals(hostIP)) {
                    iterator.remove();
                }
            }
        }
    }

    public String getIpByName(String hostName) {
        String hostIp = "";
        for (DnsEntry de: dnsEntries) {
            if (isContainByName(hostName)) {
                hostIp = de.hostIP;
            } else {
                throw new IllegalArgumentException("Element not found");
            }
        }
        return hostIp;
    }

    public String  getNameByIp (String hostIP) {
        String hostName = "";
        for (DnsEntry de: dnsEntries) {
            if (isContainByIp(hostIP)) {
                hostName = de.hostName;
            } else {
                throw new IllegalArgumentException("Element not found");
            }
        }
        return hostName;
    }

    private boolean isContainByName(String hostName) {
        for (DnsEntry de: dnsEntries) {
            if (de.hostName.equals(hostName)) {
                return true;
            }
        }
        return false;
    }

    private boolean isContainByIp(String hostIP) {
        for (DnsEntry de: dnsEntries) {
            if (de.hostIP.equals(hostIP)) {
                return true;
            }
        }
        return false;
    }

    private static class DnsEntry {
            private String hostName;
            private String hostIP;

            public DnsEntry(String hostName, String hostIP) {
                this.hostName = hostName;
                this.hostIP = hostIP;
            }
    }

}
