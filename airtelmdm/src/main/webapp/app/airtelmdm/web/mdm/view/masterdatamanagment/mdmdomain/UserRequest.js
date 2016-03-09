Ext.define('Airtelmdm.airtelmdm.web.mdm.view.masterdatamanagment.mdmdomain.UserRequest', {
     "xtype": "userRequest",
     "items": [{
          "xtype": "panel",
          "items": [{
               "xtype": "combo",
               "name": "circle",
               "margin": 5,
               "bindable": "circle",
               "typeAhead": true,
               "queryMode": "local",
               "minChars": 1,
               "fieldLabel": "Select Circle",
               "displayField": "circlename",
               "valueField": "circleid",
               "itemId": "combo_88",
               "store": {
                    "model": "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.CircleModel",
                    "autoLoad": true,
                    "autoSync": true,
                    "sorters": [{
                         "property": "circlename",
                         "direction": "ASC"
                    }],
                    "proxy": {
                         "type": "ajax",
                         "url": "secure/Circle/findAll",
                         "actionMethods": {
                              "read": "GET"
                         },
                         "headers": {
                              "Content-Type": "application/json"
                         },
                         "extraParams": {},
                         "reader": {
                              "type": "json",
                              "rootProperty": "response.data"
                         }
                    }
               }
          }, {
               "xtype": "textfield",
               "fieldLabel": "Item Code",
               "margin": 5,
               "bindable": "itemcode",
               "name": "itemcode",
               "itemId": "textfield_54"
          }, {
               "xtype": "textfield",
               "fieldLabel": "Item Description",
               "margin": 5,
               "bindable": "itemdesc",
               "name": "itemdesc",
               "itemId": "textfield_28"
          }, {
               "xtype": "button",
               "name": "submitRequest",
               "text": "Submit",
               "margin": 5,
               "isSubmitBtn": true,
               "itemId": "button_39",
               "listeners": {
                    "click": "onsubmitRequestclick"
               }
          }],
          "layout": {
               "type": "vbox"
          },
          "autoScroll": true,
          "margin": 5,
          "dockedItems": [],
          "itemId": "panel_29"
     }],
     "margin": 5,
     "border": true,
     "autoScroll": true,
     "title": "User Request",
     "dockedItems": [],
     "itemId": "panel_32",
     "requires": ["Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.CircleModel", "Airtelmdm.airtelmdm.web.mdm.controller.masterdatamanagment.mdmdomain.UserRequestController", "Airtelmdm.airtelmdm.shared.mdm.viewmodel.masterdatamanagment.mdmdomain.UserRequestViewModel", "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.UserRequestModel"],
     "extend": "Ext.panel.Panel",
     "viewModel": "UserRequestViewModel",
     "controller": "UserRequestController"
});