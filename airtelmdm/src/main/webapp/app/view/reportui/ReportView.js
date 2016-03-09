Ext.define('Airtelmdm.view.reportui.ReportView', {
	extend : 'Ext.panel.Panel',
	requires : [ 'Airtelmdm.view.reportui.querycriteria.QueryCriteriaView',
			'Airtelmdm.view.reportui.datachart.DataChartViewTab',
			'Airtelmdm.view.reportui.datachart.DataChartViewPanel',
			'Airtelmdm.view.reportui.ReportViewController' ,
			'Airtelmdm.view.fw.MainDataPointPanel',
			'Airtelmdm.view.googlemaps.map.MapPanel'
			],
	xtype : 'reportview',
	controller : 'reportviewController',
	layout : 'border',
	isCustomReport:false,
	reportWidgets :["1","2","3","4"],
	//autoScroll : true,
	//margin : '3 0 5 0',
	height:500,
	width:"100%",
	listeners : {
		scope : 'controller',
		afterrender : 'renderReport'
	}
});
