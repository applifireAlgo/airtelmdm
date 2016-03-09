Ext.define('Airtelmdm.view.reportui.datachart.DataChartViewTab', {
	extend : 'Ext.tab.Panel',
	requires : [ 'Airtelmdm.view.reportui.datachart.DataChartTController',
	             'Airtelmdm.view.reportui.datachart.datagrid.DataGridView',
	             'Airtelmdm.view.reportui.datachart.chart.ChartTabView',
	             'Airtelmdm.view.reportui.datachart.ChartPointView' ],
	controller : 'datacharttController',
	xtype : 'datachart-tabpanel',
	tabPosition : 'bottom',
	bodyStyle : 'background:#D8D8D8',
	listeners : {
		scope : "controller",
		tabchange : 'tabchange',
		afterrender:'afterTabPanelRender'
	}
});