package Basic;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class FileTest {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:\\sample.txt");
		int i;
		StringBuilder sr = null;
		String line = "";
		while ((i = fr.read()) != -1) {
			// System.out.print((char) i);
			line += (char) i;
		}
		fr.close();
		sr = new StringBuilder(line);
		// System.out.println(sr);
		String[] edit = line.split("edit ");
		List<TestBean> list = new ArrayList<>();
		for (int k = 0; k < edit.length; k++) {
			System.err.println("port number = " + edit[k]);

			TestBean bean = new TestBean();
			bean.setPort(edit[k].split(" ")[0]);
			String[] ss = edit[k].split(" ");
			System.out.println(ss.length);
			for (int j = 0; j < ss.length; j++) {
				if (ss[j].equals("name")) {
					bean.setName(ss[j + 1]);
				} else if (ss[j].equals("uuid")) {
					bean.setUuid(ss[j + 1]);
				} else if (ss[j].equals("srcintf")) {
					bean.setSrcintf(ss[j + 1]);
				} else if (ss[j].equals("dstintf")) {
					bean.setDstintf(ss[j + 1]);
				} else if (ss[j].equals("srcaddr")) {
					bean.setSrcaddr(ss[j + 1]);
				} else if (ss[j].equals("dstaddr")) {
					bean.setDstaddr(ss[j + 1]);
				} else if (ss[j].equals("internet-service")) {
					bean.setInternet_service(ss[j + 1]);
				} else if (ss[j].equals("internet-service-src ")) {
					bean.setInternet_service_src(ss[j + 1]);
				} else if (ss[j].equals("reputation-minimum")) {
					bean.setReputation_minimum(ss[j + 1]);
				} else if (ss[j].equals("rtp-nat")) {
					bean.setRtp_nat(ss[j + 1]);
				} else if (ss[j].equals("action")) {
					bean.setAction(ss[j + 1]);
				} else if (ss[j].equals("status")) {
					bean.setStatus(ss[j + 1]);
				} else if (ss[j].equals("schedule")) {
					bean.setSchedule(ss[j + 1]);
				} else if (ss[j].equals("schedule-timeout")) {
					bean.setSchedule_timeout(ss[j + 1]);
				} else if (ss[j].equals("service")) {
					bean.setService(ss[j + 1]);
				} else if (ss[j].equals("tos-mask")) {
					bean.setTos_mask(ss[j + 1]);
				} else if (ss[j].equals("anti-replay")) {
					bean.setAnti_replay(ss[j + 1]);
				} else if (ss[j].equals("utm-status")) {
					bean.setUtm_status(ss[j + 1]);
				} else if (ss[j].equals("inspection-mode")) {
					bean.setInspection_mode(ss[j + 1]);
				} else if (ss[j].equals("logtraffic")) {
					bean.setLogtraffic(ss[j + 1]);
				} else if (ss[j].equals("logtraffic-start")) {
					bean.setLogtraffic_start(ss[j + 1]);
				} else if (ss[j].equals("capture-packet")) {
					bean.setCapture_packet(ss[j + 1]);
				} else if (ss[j].equals("auto-asic-offload")) {
					bean.setAuto_asic_offload(ss[j + 1]);
				} else if (ss[j].equals("session-ttl")) {
					bean.setSession_ttl(ss[j + 1]);
				} else if (ss[j].equals("vlan-cos-fwd")) {
					bean.setVlan_cos_fwd(ss[j + 1]);
				} else if (ss[j].equals("vlan-cos-rev")) {
					bean.setVlan_cos_rev(ss[j + 1]);
				} else if (ss[j].equals("wccp")) {
					bean.setWccp(ss[j + 1]);
				} else if (ss[j].equals("fsso")) {
					bean.setFsso(ss[j + 1]);
				} else if (ss[j].equals("disclaimer")) {
					bean.setDisclaimer(ss[j + 1]);
				} else if (ss[j].equals("email-collect")) {
					bean.setEmail_collect(ss[j + 1]);
				} else if (ss[j].equals("natip")) {
					bean.setNatip(ss[j + 1]);
				} else if (ss[j].equals("diffserv-forward")) {
					bean.setDiffserv_forward(ss[j + 1]);
				} else if (ss[j].equals("diffserv-reverse")) {
					bean.setDiffserv_reverse(ss[j + 1]);
				} else if (ss[j].equals("tcp-mss-sender")) {
					bean.setTcp_mss_sender(ss[j + 1]);
				} else if (ss[j].equals("tcp-mss-receiver ")) {
					bean.setTcp_mss_receiver(ss[j + 1]);
				} else if (ss[j].equals("comments")) {
					bean.setComments(ss[j + 1]);
				} else if (ss[j].equals("block-notification")) {
					bean.setBlock_notification(ss[j + 1]);
				} else if (ss[j].equals("replacemsg-override-group")) {
					bean.setReplacemsg_override_group(ss[j + 1]);
				} else if (ss[j].equals("srcaddr-negate")) {
					bean.setSrcaddr(ss[j + 1]);
				} else if (ss[j].equals("dstaddr-negate")) {
					bean.setDstaddr(ss[j + 1]);
				} else if (ss[j].equals("service-negate")) {
					bean.setService_negate(ss[j + 1]);
				} else if (ss[j].equals("timeout-send-rst")) {
					bean.setTimeout_send_rst(ss[j + 1]);
				} else if (ss[j].equals("captive-portal-exempt")) {
					bean.setCaptive_portal_exempt(ss[j + 1]);
				} else if (ss[j].equals("ssl-mirror")) {
					bean.setSsl_mirror(ss[j + 1]);
				} else if (ss[j].equals("dsri")) {
					bean.setDsri(ss[j + 1]);
				} else if (ss[j].equals("radius-mac-auth-bypass")) {
					bean.setRadius_mac_auth_bypass(ss[j + 1]);
				} else if (ss[j].equals("delay-tcp-npu-session")) {
					bean.setDelay_tcp_npu_session(ss[j + 1]);
				} else if (ss[j].equals("vlan-filter")) {
					bean.setVlan_filter(ss[j + 1]);
				} else if (ss[j].equals("profile-protocol-options")) {
					bean.setProfile_protocol_options(ss[j + 1]);
				} else if (ss[j].equals("ssl-ssh-profile")) {
					bean.setSsl_ssh_profile(ss[j + 1]);
				} else if (ss[j].equals("traffic-shaper")) {
					bean.setTraffic_shaper(ss[j + 1]);
				} else if (ss[j].equals("traffic-shaper-reverse")) {
					bean.setTraffic_shaper_reverse(ss[j + 1]);
				} else if (ss[j].equals("per-ip-shaper")) {
					bean.setPer_ip_shaper(ss[j + 1]);
				} else if (ss[j].equals("nat")) {
					bean.setNat(ss[j + 1]);
				} else if (ss[j].equals("match-vip")) {
					bean.setMatch_vip(ss[j + 1]);
				}
			}
			System.out.println(bean.toString());
			list.add(bean);
		}
		createExcel(list);
		System.out.println("========= list size = " + list.size());
	}

	public static void createExcel(List<TestBean> list) {

		try {
			String filename = "D:\\sample.xls";
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("FirstSheet");

			HSSFRow rowhead = sheet.createRow((short) 0);
			rowhead.createCell(0).setCellValue("Port");
			rowhead.createCell(1).setCellValue("name");
			rowhead.createCell(2).setCellValue("uuid");
			rowhead.createCell(3).setCellValue("srcintf");
			rowhead.createCell(4).setCellValue("dstintf");
			rowhead.createCell(5).setCellValue("srcaddr");
			rowhead.createCell(6).setCellValue("dstaddr");
			rowhead.createCell(7).setCellValue("internet-service");
			rowhead.createCell(8).setCellValue("internet-service-src ");
			rowhead.createCell(9).setCellValue("reputation-minimum");
			rowhead.createCell(10).setCellValue("rtp_nat");
			rowhead.createCell(11).setCellValue("action");
			rowhead.createCell(12).setCellValue("status");
			rowhead.createCell(13).setCellValue("schedule");
			rowhead.createCell(14).setCellValue("schedule_timeout");
			rowhead.createCell(15).setCellValue("service");
			rowhead.createCell(16).setCellValue("tos_mask");
			rowhead.createCell(17).setCellValue("anti_reply");
			rowhead.createCell(18).setCellValue("utm_status");
			rowhead.createCell(19).setCellValue("inspection_mode");
			rowhead.createCell(20).setCellValue("Togtraffic");
			rowhead.createCell(21).setCellValue("logtraffic_start");
			rowhead.createCell(22).setCellValue("capture_packet");
			rowhead.createCell(23).setCellValue("auto_asic_offload");
			rowhead.createCell(24).setCellValue("session_ttl");
			rowhead.createCell(25).setCellValue("vlan_cos_fwd");
			rowhead.createCell(26).setCellValue("vlan_cos_rev");
			rowhead.createCell(27).setCellValue("wccp");
			rowhead.createCell(28).setCellValue("fsso");
			rowhead.createCell(29).setCellValue("disclaimer");
			rowhead.createCell(30).setCellValue("email_collect");
			rowhead.createCell(31).setCellValue("natip");
			rowhead.createCell(32).setCellValue("diffserv_forward");
			rowhead.createCell(33).setCellValue("diffserv_reverse");
			rowhead.createCell(34).setCellValue("tcp_mss_sender");
			rowhead.createCell(35).setCellValue("tcp_mss_receiver");
			rowhead.createCell(36).setCellValue("comments");
			rowhead.createCell(37).setCellValue("block_notification");
			rowhead.createCell(38).setCellValue("replacemsg_override_group");
			rowhead.createCell(39).setCellValue("srcaddr_negate");
			rowhead.createCell(40).setCellValue("dstaddr_negate");
			rowhead.createCell(41).setCellValue("service_negate");
			rowhead.createCell(42).setCellValue("timeout_send_rst");
			rowhead.createCell(43).setCellValue("captive_portal_exempt");
			rowhead.createCell(44).setCellValue("ssl_mirror");
			rowhead.createCell(45).setCellValue("dsri");
			rowhead.createCell(46).setCellValue("radius_mac_auth_bypass");
			rowhead.createCell(47).setCellValue("delay_tcp_npu_session");
			rowhead.createCell(48).setCellValue("vlan_filter");
			rowhead.createCell(49).setCellValue("profile_protocol_options");
			rowhead.createCell(50).setCellValue("ssl_ssh_profile");
			rowhead.createCell(51).setCellValue("traffic_shaper");
			rowhead.createCell(52).setCellValue("traffic_shaper_reverse");
			rowhead.createCell(53).setCellValue("per_ip_shaper");
			rowhead.createCell(54).setCellValue("nat");
			rowhead.createCell(55).setCellValue("match_vip");

			for (int i = 1; i < list.size(); i++) {
				TestBean bean = list.get(i);
				HSSFRow row = sheet.createRow(i);
				row.createCell(0).setCellValue(bean.getPort());
				row.createCell(1).setCellValue(bean.getName());
				row.createCell(2).setCellValue(bean.getSrcintf());
				row.createCell(3).setCellValue(bean.getDstintf());
				row.createCell(4).setCellValue(bean.getSrcaddr());
				row.createCell(5).setCellValue(bean.getDstaddr());
				row.createCell(6).setCellValue(bean.getInternet_service());
				row.createCell(7).setCellValue(bean.getInternet_service_src());
				row.createCell(8).setCellValue(bean.getReputation_minimum());
				row.createCell(0).setCellValue(bean.getRtp_nat());
				row.createCell(0).setCellValue(bean.getAction());
				row.createCell(0).setCellValue(bean.getStatus());
				row.createCell(0).setCellValue(bean.getSchedule());
				row.createCell(0).setCellValue(bean.getSchedule_timeout());
				row.createCell(0).setCellValue(bean.getService());
				row.createCell(0).setCellValue(bean.getTos_mask());
				row.createCell(0).setCellValue(bean.getAnti_replay());
				row.createCell(0).setCellValue(bean.getUtm_status());
				row.createCell(0).setCellValue(bean.getInspection_mode());
				row.createCell(0).setCellValue(bean.getLogtraffic());
				row.createCell(0).setCellValue(bean.getLogtraffic_start());
				row.createCell(0).setCellValue(bean.getCapture_packet());
				row.createCell(0).setCellValue(bean.getAuto_asic_offload());
				row.createCell(0).setCellValue(bean.getSession_ttl());
				row.createCell(0).setCellValue(bean.getVlan_cos_fwd());
				row.createCell(0).setCellValue(bean.getVlan_cos_rev());
				row.createCell(0).setCellValue(bean.getWccp());
				row.createCell(0).setCellValue(bean.getFsso());
				row.createCell(0).setCellValue(bean.getDisclaimer());
				row.createCell(0).setCellValue(bean.getEmail_collect());
				row.createCell(0).setCellValue(bean.getNatip());
				row.createCell(0).setCellValue(bean.getDiffserv_forward());
				row.createCell(0).setCellValue(bean.getDiffserv_reverse());
				row.createCell(0).setCellValue(bean.getTcp_mss_sender());
				row.createCell(0).setCellValue(bean.getTcp_mss_receiver());
				row.createCell(0).setCellValue(bean.getComments());
				row.createCell(0).setCellValue(bean.getBlock_notification());
				row.createCell(0).setCellValue(bean.getReplacemsg_override_group());
				row.createCell(0).setCellValue(bean.getSrcaddr());
				row.createCell(0).setCellValue(bean.getService_negate());
				row.createCell(0).setCellValue(bean.getTimeout_send_rst());
				row.createCell(0).setCellValue(bean.getCaptive_portal_exempt());
				row.createCell(0).setCellValue(bean.getSsl_mirror());
				row.createCell(0).setCellValue(bean.getDsri());
				row.createCell(0).setCellValue(bean.getRadius_mac_auth_bypass());
				row.createCell(0).setCellValue(bean.getDelay_tcp_npu_session());
				row.createCell(0).setCellValue(bean.getVlan_filter());
				row.createCell(0).setCellValue(bean.getProfile_protocol_options());
				row.createCell(0).setCellValue(bean.getSsl_ssh_profile());
				row.createCell(0).setCellValue(bean.getTraffic_shaper());
				row.createCell(0).setCellValue(bean.getTraffic_shaper_reverse());
				row.createCell(0).setCellValue(bean.getPer_ip_shaper());
				row.createCell(0).setCellValue(bean.getNat());
				row.createCell(0).setCellValue(bean.getMatch_vip());

				
			}
			FileOutputStream fileOut = new FileOutputStream(filename);
			workbook.write(fileOut);
			fileOut.close();
			//workbook.close();
			System.out.println("Your excel file has been generated!");

		} catch (Exception ex) {
			System.out.println(ex);
		}

	}
}
