Ext.define('Airtelmdm.airtelmdm.web.mdm.controller.masterdatamanagment.mdmdomain.CreateRequestController', {
     extend: 'Airtelmdm.view.fw.frameworkController.FrameworkViewController',
     alias: 'controller.CreateRequestController',
     oncreaterequestclick: function(me, e, eOpts) {
          var form = me.up('form');
          if (form.isValid()) {
               var jsonData = this.getData(form);
               var scope = this.getView();
               Ext.Ajax.request({
                    url: 'secure/Spocrequest/',
                    async: false,
                    method: 'POST',
                    sender: scope,
                    jsonData: jsonData,
                    me: me,
                    maskEnable: true,
                    maskEle: scope,
                    success: function(response, scope) {
                         var responseText = Ext.JSON.decode(response.responseText);
                         if (responseText.response.success) {
                              Ext.Msg.alert('Server Response', 'Request created successfully');
                              scope.sender.reset();
                         } else {
                              Ext.Msg.alert('Server Response', responseText.response.message);
                         }
                    },
                    failure: function(response, scope) {
                         Ext.Msg.alert('Server Response', 'Failed to create request, Please try after some time');
                    }
               }, scope);
          }
     }
});