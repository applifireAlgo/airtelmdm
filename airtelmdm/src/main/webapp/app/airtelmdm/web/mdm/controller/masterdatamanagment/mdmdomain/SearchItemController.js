Ext.define('Airtelmdm.airtelmdm.web.mdm.controller.masterdatamanagment.mdmdomain.SearchItemController', {
     extend: 'Airtelmdm.view.fw.frameworkController.FrameworkViewController',
     alias: 'controller.SearchItemController',
     onsearchclick: function(me, e, eOpts) {
          var form = me.up('form');
          if (form.isValid()) {
               var jsonData = this.getData(form);
               var scope = this.getView();
               Ext.Ajax.request({
                    url: 'secure/SPOCSearchServiceWS/search',
                    async: true,
                    method: 'POST',
                    sender: scope,
                    jsonData: jsonData,
                    me: me,
                    maskEnable: true,
                    maskEle: scope,
                    success: function(response, scope) {
                         var responseText = Ext.JSON.decode(response.responseText);
                         if (responseText.response.success) {
                              Ext.Msg.alert('Server Response', responseText.response.message);
                              scope.sender.reset();
                              var responseData = responseText.response.data;
                              var searchresults = scope.sender.down('#gridpanel_9');
                              searchresults.store.setData(responseData);
                         } else {
                              Ext.Msg.alert('Server Response', responseText.response.message);
                         }
                    },
                    failure: function(response, scope) {
                         var responseText = Ext.JSON.decode(response.responseText);
                         Ext.Msg.alert('Server Response', responseText.response.message);
                    }
               }, scope);
          }
     },
     ondeletereqclick: function(me, e, eOpts) {
          var form = me.up('form');
          if (form.isValid()) {
               var jsonData = this.getData(form);
               var scope = this.getView();
               Ext.Ajax.request({
                    url: 'secure/Address/findAll',
                    async: true,
                    method: 'GET',
                    sender: scope,
                    jsonData: jsonData,
                    me: me,
                    maskEnable: true,
                    maskEle: scope,
                    success: function(response, scope) {
                         var responseText = Ext.JSON.decode(response.responseText);
                         if (responseText.response.success) {
                              Ext.Msg.alert('Server Response', responseText.response.message);
                              scope.sender.reset();
                         } else {
                              Ext.Msg.alert('Server Response', responseText.response.message);
                         }
                    },
                    failure: function(response, scope) {
                         var responseText = Ext.JSON.decode(response.responseText);
                         Ext.Msg.alert('Server Response', responseText.response.message);
                    }
               }, scope);
          }
     },
     oncreatereqclick: function(me, e, eOpts) {
          var form = me.up('form');
          if (form.isValid()) {
               var jsonData = this.getData(form);
               var scope = this.getView();
               Ext.Ajax.request({
                    url: 'secure/Address/findAll',
                    async: true,
                    method: 'GET',
                    sender: scope,
                    jsonData: jsonData,
                    me: me,
                    maskEnable: true,
                    maskEle: scope,
                    success: function(response, scope) {
                         var responseText = Ext.JSON.decode(response.responseText);
                         if (responseText.response.success) {
                              Ext.Msg.alert('Server Response', responseText.response.message);
                              scope.sender.reset();
                         } else {
                              Ext.Msg.alert('Server Response', responseText.response.message);
                         }
                    },
                    failure: function(response, scope) {
                         var responseText = Ext.JSON.decode(response.responseText);
                         Ext.Msg.alert('Server Response', responseText.response.message);
                    }
               }, scope);
          }
     },
     onupdatereqclick: function(me, e, eOpts) {
          var form = me.up('form');
          if (form.isValid()) {
               var jsonData = this.getData(form);
               var scope = this.getView();
               Ext.Ajax.request({
                    url: 'secure/Address/findAll',
                    async: true,
                    method: 'GET',
                    sender: scope,
                    jsonData: jsonData,
                    me: me,
                    maskEnable: true,
                    maskEle: scope,
                    success: function(response, scope) {
                         var responseText = Ext.JSON.decode(response.responseText);
                         if (responseText.response.success) {
                              Ext.Msg.alert('Server Response', responseText.response.message);
                              scope.sender.reset();
                         } else {
                              Ext.Msg.alert('Server Response', responseText.response.message);
                         }
                    },
                    failure: function(response, scope) {
                         var responseText = Ext.JSON.decode(response.responseText);
                         Ext.Msg.alert('Server Response', responseText.response.message);
                    }
               }, scope);
          }
     },
     onviewdetailsclick: function(me, e, eOpts) {
          var form = me.up('form');
          if (form.isValid()) {
               var jsonData = this.getData(form);
               var scope = this.getView();
               Ext.Ajax.request({
                    url: 'secure/Address/findAll',
                    async: false,
                    method: 'GET',
                    sender: scope,
                    jsonData: jsonData,
                    me: me,
                    maskEnable: true,
                    maskEle: scope,
                    success: function(response, scope) {
                         var responseText = Ext.JSON.decode(response.responseText);
                         if (responseText.response.success) {
                              Ext.Msg.alert('Server Response', responseText.response.message);
                              scope.sender.reset();
                         } else {
                              Ext.Msg.alert('Server Response', responseText.response.message);
                         }
                    },
                    failure: function(response, scope) {
                         var responseText = Ext.JSON.decode(response.responseText);
                         Ext.Msg.alert('Server Response', responseText.response.message);
                    }
               }, scope);
          }
     }
});