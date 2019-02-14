package report.jasper;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;

public class MyJasperReport {
	
	protected String jasperName;
	

	protected void loadData() {
        //
    }

	protected Map<String, Object> toJasperParams() {
		return Collections.emptyMap();
	}

	protected List<Map<String, Object>> convertToDataList() {
		return Collections.emptyList();
	};
	
	public JRDataSource toDataSource() {
		final List<Map<String, Object>> maps = this.convertToDataList();
		if (CollectionUtils.isNotEmpty(maps)) {
			return new JRBeanCollectionDataSource(maps);
		} else {
			return new JREmptyDataSource();
		}
	}
	
	public JasperReport getJasperReport(){
		try {
		File jasperFile = new File("src/main/resources/jasper/"+jasperName+".jasper");
		JasperReport jasperReport = (JasperReport) JRLoader.loadObject(jasperFile);
		return jasperReport;	
		} catch (final Exception e) {
			System.out.println(e.getMessage());
			return null;	
		}
	}
	
	public String getPDFPath() {
		return "src/main/resources/pdf/"+jasperName+".pdf";		
	}

	public void generateReport() {
		try {
			JasperPrint jasperPrint = null;

			// ireport已經編譯成jasper檔，程式只需產生JasperPrint物件再匯出文件
			jasperPrint = JasperFillManager.fillReport(getJasperReport(), toJasperParams(), toDataSource());

			File pdfFile = new File(getPDFPath());
			final FileOutputStream fos = new FileOutputStream(pdfFile);
			JasperExportManager.exportReportToPdfStream(jasperPrint, fos);
		} catch (final Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
