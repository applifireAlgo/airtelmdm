Ext.define('Airtelmdm.view.databrowsercalendar.DBCalendar', {
	extend : 'Airtelmdm.view.databrowsercalendar.DBCalendarView',
	requires : [ 'Airtelmdm.view.databrowsercalendar.DBCalendarController',
	             'Airtelmdm.view.databrowsercalendar.DBCalendarView','Ext.layout.container.Card',
	             'Ext.calendar.view.Day', 'Ext.calendar.view.Week',
	             'Ext.calendar.view.Month',
	             'Ext.calendar.form.EventDetails',
	             'Ext.calendar.data.EventMappings'],
	controller : 'databrowsercalendar',
	items : [],
	listeners : {
		afterrender : 'loadData',
		scope : "controller"
	}
});
