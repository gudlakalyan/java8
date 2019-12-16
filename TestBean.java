package Basic;

public class TestBean {
	private String port;
	private String name;;
	private String uuid;;
	private String srcintf;
	private String dstintf;
	private String srcaddr;
	private String dstaddr;
	private String internet_service;
	private String internet_service_src;
	private String reputation_minimum;
	private String rtp_nat;
	private String action;
	private String status;
	private String schedule;
	private String schedule_timeout;
	private String service;
	private String tos_mask;
	private String anti_replay;
	private String utm_status;
	private String inspection_mode;
	private String logtraffic;
	private String logtraffic_start;
	private String capture_packet;
	private String auto_asic_offload;
	private String session_ttl;
	private String vlan_cos_fwd;
	private String vlan_cos_rev;
	private String wccp;
	private String fsso;
	private String disclaimer;
	private String email_collect;
	private String natip;
	private String diffserv_forward;
	private String diffserv_reverse;
	private String tcp_mss_sender;
	private String tcp_mss_receiver;
	private String comments;
	private String block_notification;
	private String replacemsg_override_group;
	private String srcaddr_negate;
	private String dstaddr_negate;
	private String service_negate;
	private String timeout_send_rst;
	private String captive_portal_exempt;
	private String ssl_mirror;
	private String dsri;
	private String radius_mac_auth_bypass;
	private String delay_tcp_npu_session;
	private String vlan_filter;
	private String profile_protocol_options;
	private String ssl_ssh_profile;
	private String traffic_shaper;
	private String traffic_shaper_reverse;
	private String per_ip_shaper;
	private String nat;
	private String match_vip;

	/*
	 * port name  uuid  srcintf  dstintf  srcaddr  dstaddr 
	 * internet_service  internet_service_src  reputation_minimum  rtp_nat 
	 * action  status  schedule  schedule_timeout  service  tos_mask 
	 * anti_replay  utm_status  inspection_mode  logtraffic 
	 * logtraffic_start  capture_packet  auto_asic_offload  session_ttl 
	 * vlan_cos_fwd  vlan_cos_rev  wccp  fsso  disclaimer  email_collect
	 *  natip  diffserv_forward  diffserv_reverse  tcp_mss_sender 
	 * tcp_mss_receiver  comments  block_notification 
	 * replacemsg_override_group  srcaddr_negate  dstaddr_negate 
	 * service_negate  timeout_send_rst  captive_portal_exempt  ssl_mirror 
	 * dsri  radius_mac_auth_bypass  delay_tcp_npu_session  vlan_filter 
	 * profile_protocol_options, , ssl_ssh_profile, , traffic_shaper, ,
	 * traffic_shaper_reverse, , per_ip_shaper, , nat, , match_vip,
	 */
	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getSrcintf() {
		return srcintf;
	}

	public void setSrcintf(String srcintf) {
		this.srcintf = srcintf;
	}

	public String getDstintf() {
		return dstintf;
	}

	public void setDstintf(String dstintf) {
		this.dstintf = dstintf;
	}

	public String getSrcaddr() {
		return srcaddr;
	}

	public void setSrcaddr(String srcaddr) {
		this.srcaddr = srcaddr;
	}

	public String getDstaddr() {
		return dstaddr;
	}

	public void setDstaddr(String dstaddr) {
		this.dstaddr = dstaddr;
	}

	public String getInternet_service() {
		return internet_service;
	}

	public void setInternet_service(String internet_service) {
		this.internet_service = internet_service;
	}

	public String getInternet_service_src() {
		return internet_service_src;
	}

	public void setInternet_service_src(String internet_service_src) {
		this.internet_service_src = internet_service_src;
	}

	public String getReputation_minimum() {
		return reputation_minimum;
	}

	public void setReputation_minimum(String reputation_minimum) {
		this.reputation_minimum = reputation_minimum;
	}

	public String getRtp_nat() {
		return rtp_nat;
	}

	public void setRtp_nat(String rtp_nat) {
		this.rtp_nat = rtp_nat;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public String getSchedule_timeout() {
		return schedule_timeout;
	}

	public void setSchedule_timeout(String schedule_timeout) {
		this.schedule_timeout = schedule_timeout;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getTos_mask() {
		return tos_mask;
	}

	public void setTos_mask(String tos_mask) {
		this.tos_mask = tos_mask;
	}

	public String getAnti_replay() {
		return anti_replay;
	}

	public void setAnti_replay(String anti_replay) {
		this.anti_replay = anti_replay;
	}

	public String getUtm_status() {
		return utm_status;
	}

	public void setUtm_status(String utm_status) {
		this.utm_status = utm_status;
	}

	public String getInspection_mode() {
		return inspection_mode;
	}

	public void setInspection_mode(String inspection_mode) {
		this.inspection_mode = inspection_mode;
	}

	public String getLogtraffic() {
		return logtraffic;
	}

	public void setLogtraffic(String logtraffic) {
		this.logtraffic = logtraffic;
	}

	public String getLogtraffic_start() {
		return logtraffic_start;
	}

	public void setLogtraffic_start(String logtraffic_start) {
		this.logtraffic_start = logtraffic_start;
	}

	public String getCapture_packet() {
		return capture_packet;
	}

	public void setCapture_packet(String capture_packet) {
		this.capture_packet = capture_packet;
	}

	public String getAuto_asic_offload() {
		return auto_asic_offload;
	}

	public void setAuto_asic_offload(String auto_asic_offload) {
		this.auto_asic_offload = auto_asic_offload;
	}

	public String getSession_ttl() {
		return session_ttl;
	}

	public void setSession_ttl(String session_ttl) {
		this.session_ttl = session_ttl;
	}

	public String getVlan_cos_fwd() {
		return vlan_cos_fwd;
	}

	public void setVlan_cos_fwd(String vlan_cos_fwd) {
		this.vlan_cos_fwd = vlan_cos_fwd;
	}

	public String getVlan_cos_rev() {
		return vlan_cos_rev;
	}

	public void setVlan_cos_rev(String vlan_cos_rev) {
		this.vlan_cos_rev = vlan_cos_rev;
	}

	public String getWccp() {
		return wccp;
	}

	public void setWccp(String wccp) {
		this.wccp = wccp;
	}

	public String getFsso() {
		return fsso;
	}

	public void setFsso(String fsso) {
		this.fsso = fsso;
	}

	public String getDisclaimer() {
		return disclaimer;
	}

	public void setDisclaimer(String disclaimer) {
		this.disclaimer = disclaimer;
	}

	public String getEmail_collect() {
		return email_collect;
	}

	public void setEmail_collect(String email_collect) {
		this.email_collect = email_collect;
	}

	public String getNatip() {
		return natip;
	}

	public void setNatip(String natip) {
		this.natip = natip;
	}

	public String getDiffserv_forward() {
		return diffserv_forward;
	}

	public void setDiffserv_forward(String diffserv_forward) {
		this.diffserv_forward = diffserv_forward;
	}

	public String getDiffserv_reverse() {
		return diffserv_reverse;
	}

	public void setDiffserv_reverse(String diffserv_reverse) {
		this.diffserv_reverse = diffserv_reverse;
	}

	public String getTcp_mss_sender() {
		return tcp_mss_sender;
	}

	public void setTcp_mss_sender(String tcp_mss_sender) {
		this.tcp_mss_sender = tcp_mss_sender;
	}

	public String getTcp_mss_receiver() {
		return tcp_mss_receiver;
	}

	public void setTcp_mss_receiver(String tcp_mss_receiver) {
		this.tcp_mss_receiver = tcp_mss_receiver;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getBlock_notification() {
		return block_notification;
	}

	public void setBlock_notification(String block_notification) {
		this.block_notification = block_notification;
	}

	public String getReplacemsg_override_group() {
		return replacemsg_override_group;
	}

	public void setReplacemsg_override_group(String replacemsg_override_group) {
		this.replacemsg_override_group = replacemsg_override_group;
	}

	public String getSrcaddr_negate() {
		return srcaddr_negate;
	}

	public void setSrcaddr_negate(String srcaddr_negate) {
		this.srcaddr_negate = srcaddr_negate;
	}

	public String getDstaddr_negate() {
		return dstaddr_negate;
	}

	public void setDstaddr_negate(String dstaddr_negate) {
		this.dstaddr_negate = dstaddr_negate;
	}

	public String getService_negate() {
		return service_negate;
	}

	public void setService_negate(String service_negate) {
		this.service_negate = service_negate;
	}

	public String getTimeout_send_rst() {
		return timeout_send_rst;
	}

	public void setTimeout_send_rst(String timeout_send_rst) {
		this.timeout_send_rst = timeout_send_rst;
	}

	public String getCaptive_portal_exempt() {
		return captive_portal_exempt;
	}

	public void setCaptive_portal_exempt(String captive_portal_exempt) {
		this.captive_portal_exempt = captive_portal_exempt;
	}

	public String getSsl_mirror() {
		return ssl_mirror;
	}

	public void setSsl_mirror(String ssl_mirror) {
		this.ssl_mirror = ssl_mirror;
	}

	public String getDsri() {
		return dsri;
	}

	public void setDsri(String dsri) {
		this.dsri = dsri;
	}

	public String getRadius_mac_auth_bypass() {
		return radius_mac_auth_bypass;
	}

	public void setRadius_mac_auth_bypass(String radius_mac_auth_bypass) {
		this.radius_mac_auth_bypass = radius_mac_auth_bypass;
	}

	public String getDelay_tcp_npu_session() {
		return delay_tcp_npu_session;
	}

	public void setDelay_tcp_npu_session(String delay_tcp_npu_session) {
		this.delay_tcp_npu_session = delay_tcp_npu_session;
	}

	public String getVlan_filter() {
		return vlan_filter;
	}

	public void setVlan_filter(String vlan_filter) {
		this.vlan_filter = vlan_filter;
	}

	public String getProfile_protocol_options() {
		return profile_protocol_options;
	}

	public void setProfile_protocol_options(String profile_protocol_options) {
		this.profile_protocol_options = profile_protocol_options;
	}

	public String getSsl_ssh_profile() {
		return ssl_ssh_profile;
	}

	public void setSsl_ssh_profile(String ssl_ssh_profile) {
		this.ssl_ssh_profile = ssl_ssh_profile;
	}

	public String getTraffic_shaper() {
		return traffic_shaper;
	}

	public void setTraffic_shaper(String traffic_shaper) {
		this.traffic_shaper = traffic_shaper;
	}

	public String getTraffic_shaper_reverse() {
		return traffic_shaper_reverse;
	}

	public void setTraffic_shaper_reverse(String traffic_shaper_reverse) {
		this.traffic_shaper_reverse = traffic_shaper_reverse;
	}

	public String getPer_ip_shaper() {
		return per_ip_shaper;
	}

	public void setPer_ip_shaper(String per_ip_shaper) {
		this.per_ip_shaper = per_ip_shaper;
	}

	public String getNat() {
		return nat;
	}

	public void setNat(String nat) {
		this.nat = nat;
	}

	public String getMatch_vip() {
		return match_vip;
	}

	public void setMatch_vip(String match_vip) {
		this.match_vip = match_vip;
	}

	@Override
	public String toString() {
		return "TestBean [port=" + port + ", name=" + name + ", uuid=" + uuid + ", srcintf=" + srcintf + ", dstintf="
				+ dstintf + ", srcaddr=" + srcaddr + ", dstaddr=" + dstaddr + ", internet_service=" + internet_service
				+ ", internet_service_src=" + internet_service_src + ", reputation_minimum=" + reputation_minimum
				+ ", rtp_nat=" + rtp_nat + ", action=" + action + ", status=" + status + ", schedule=" + schedule
				+ ", schedule_timeout=" + schedule_timeout + ", service=" + service + ", tos_mask=" + tos_mask
				+ ", anti_replay=" + anti_replay + ", utm_status=" + utm_status + ", inspection_mode=" + inspection_mode
				+ ", logtraffic=" + logtraffic + ", logtraffic_start=" + logtraffic_start + ", capture_packet="
				+ capture_packet + ", auto_asic_offload=" + auto_asic_offload + ", session_ttl=" + session_ttl
				+ ", vlan_cos_fwd=" + vlan_cos_fwd + ", vlan_cos_rev=" + vlan_cos_rev + ", wccp=" + wccp + ", fsso="
				+ fsso + ", disclaimer=" + disclaimer + ", email_collect=" + email_collect + ", natip=" + natip
				+ ", diffserv_forward=" + diffserv_forward + ", diffserv_reverse=" + diffserv_reverse
				+ ", tcp_mss_sender=" + tcp_mss_sender + ", tcp_mss_receiver=" + tcp_mss_receiver + ", comments="
				+ comments + ", block_notification=" + block_notification + ", replacemsg_override_group="
				+ replacemsg_override_group + ", srcaddr_negate=" + srcaddr_negate + ", dstaddr_negate="
				+ dstaddr_negate + ", service_negate=" + service_negate + ", timeout_send_rst=" + timeout_send_rst
				+ ", captive_portal_exempt=" + captive_portal_exempt + ", ssl_mirror=" + ssl_mirror + ", dsri=" + dsri
				+ ", radius_mac_auth_bypass=" + radius_mac_auth_bypass + ", delay_tcp_npu_session="
				+ delay_tcp_npu_session + ", vlan_filter=" + vlan_filter + ", profile_protocol_options="
				+ profile_protocol_options + ", ssl_ssh_profile=" + ssl_ssh_profile + ", traffic_shaper="
				+ traffic_shaper + ", traffic_shaper_reverse=" + traffic_shaper_reverse + ", per_ip_shaper="
				+ per_ip_shaper + ", nat=" + nat + ", match_vip=" + match_vip + "]";
	}

}
