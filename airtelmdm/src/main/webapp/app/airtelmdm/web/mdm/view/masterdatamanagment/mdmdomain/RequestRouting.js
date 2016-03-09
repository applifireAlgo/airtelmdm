Ext.define('Airtelmdm.airtelmdm.web.mdm.view.masterdatamanagment.mdmdomain.RequestRouting', {
     "xtype": "requestRouting",
     "items": [{
          "xtype": "panel",
          "items": [{
               "xtype": "combo",
               "name": "itemcategory",
               "margin": 5,
               "bindable": "itemcategory",
               "typeAhead": true,
               "queryMode": "local",
               "minChars": 1,
               "fieldLabel": "Item Category",
               "displayField": "itemcategoryid",
               "valueField": "itemcategoryname",
               "itemId": "combo_33",
               "rowspan": 0,
               "colspan": 0,
               "store": {
                    "model": "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.ItemcategorytypeModel",
                    "autoLoad": true,
                    "autoSync": true,
                    "sorters": [{
                         "property": "itemcategoryid",
                         "direction": "ASC"
                    }],
                    "proxy": {
                         "type": "ajax",
                         "url": "secure/Itemcategorytype/findAll",
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
               "xtype": "combo",
               "name": "userid",
               "margin": 5,
               "bindable": "userid",
               "typeAhead": true,
               "queryMode": "local",
               "minChars": 1,
               "fieldLabel": "Route Request",
               "displayField": "usercircleid",
               "valueField": "userid",
               "rowspan": 0,
               "colspan": 0,
               "itemId": "combo_75",
               "store": {
                    "model": "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.UsercirclemapModel",
                    "autoLoad": true,
                    "autoSync": true,
                    "sorters": [{
                         "property": "usercircleid",
                         "direction": "ASC"
                    }],
                    "proxy": {
                         "type": "ajax",
                         "url": "secure/Usercirclemap/findAll",
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
               "xtype": "displayfield",
               "margin": 5,
               "bindable": "dis1",
               "name": "dis1",
               "itemId": "displayfield_3"
          }, {
               "xtype": "combo",
               "name": "itemcategory2",
               "margin": 5,
               "bindable": "itemcategory2",
               "typeAhead": true,
               "queryMode": "local",
               "minChars": 1,
               "fieldLabel": "Item Category",
               "displayField": "itemcategoryid",
               "valueField": "itemcategoryname",
               "rowspan": 0,
               "colspan": 0,
               "itemId": "combo_88",
               "store": {
                    "model": "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.ItemcategorytypeModel",
                    "autoLoad": true,
                    "autoSync": true,
                    "sorters": [{
                         "property": "itemcategoryid",
                         "direction": "ASC"
                    }],
                    "proxy": {
                         "type": "ajax",
                         "url": "secure/Itemcategorytype/findAll",
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
               "xtype": "combo",
               "name": "itemtype",
               "margin": 5,
               "bindable": "itemtype",
               "typeAhead": true,
               "queryMode": "local",
               "minChars": 1,
               "fieldLabel": "Item Type",
               "displayField": "itemtypename",
               "valueField": "itemtypeid",
               "rowspan": 0,
               "colspan": 0,
               "itemId": "combo_84",
               "store": {
                    "model": "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.ItemtypeModel",
                    "autoLoad": true,
                    "autoSync": true,
                    "sorters": [{
                         "property": "itemtypename",
                         "direction": "ASC"
                    }],
                    "proxy": {
                         "type": "ajax",
                         "url": "secure/Itemtype/findAll",
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
               "xtype": "combo",
               "name": "userid2",
               "margin": 5,
               "bindable": "userid2",
               "typeAhead": true,
               "queryMode": "local",
               "minChars": 1,
               "fieldLabel": "Route Request",
               "displayField": "usercircleid",
               "valueField": "userid",
               "rowspan": 0,
               "colspan": 0,
               "itemId": "combo_1",
               "store": {
                    "model": "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.UsercirclemapModel",
                    "autoLoad": true,
                    "autoSync": true,
                    "sorters": [{
                         "property": "usercircleid",
                         "direction": "ASC"
                    }],
                    "proxy": {
                         "type": "ajax",
                         "url": "secure/Usercirclemap/findAll",
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
               "xtype": "combo",
               "name": "itemcategory3",
               "margin": 5,
               "bindable": "itemcategory3",
               "typeAhead": true,
               "queryMode": "local",
               "minChars": 1,
               "fieldLabel": "Item Category",
               "displayField": "itemcategoryid",
               "valueField": "itemcategoryname",
               "rowspan": 0,
               "colspan": 0,
               "itemId": "combo_29",
               "store": {
                    "model": "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.ItemcategorytypeModel",
                    "autoLoad": true,
                    "autoSync": true,
                    "sorters": [{
                         "property": "itemcategoryid",
                         "direction": "ASC"
                    }],
                    "proxy": {
                         "type": "ajax",
                         "url": "secure/Itemcategorytype/findAll",
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
               "xtype": "combo",
               "name": "itemtype2",
               "margin": 5,
               "bindable": "itemtype2",
               "typeAhead": true,
               "queryMode": "local",
               "minChars": 1,
               "fieldLabel": "Item Type",
               "displayField": "itemtypename",
               "valueField": "itemtypeid",
               "rowspan": 0,
               "colspan": 0,
               "itemId": "combo_45",
               "store": {
                    "model": "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.ItemtypeModel",
                    "autoLoad": true,
                    "autoSync": true,
                    "sorters": [{
                         "property": "itemtypename",
                         "direction": "ASC"
                    }],
                    "proxy": {
                         "type": "ajax",
                         "url": "secure/Itemtype/findAll",
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
               "xtype": "combo",
               "name": "userid3",
               "margin": 5,
               "bindable": "userid3",
               "typeAhead": true,
               "queryMode": "local",
               "minChars": 1,
               "fieldLabel": "Route Request",
               "displayField": "usercircleid",
               "valueField": "userid",
               "rowspan": 0,
               "colspan": 0,
               "itemId": "combo_95",
               "store": {
                    "model": "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.UsercirclemapModel",
                    "autoLoad": true,
                    "autoSync": true,
                    "sorters": [{
                         "property": "usercircleid",
                         "direction": "ASC"
                    }],
                    "proxy": {
                         "type": "ajax",
                         "url": "secure/Usercirclemap/findAll",
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
          }],
          "layout": {
               "type": "table",
               "columns": 3,
               "tableAttrs": {
                    "style": {
                         "width": "100%"
                    }
               }
          },
          "border": true,
          "margin": 5,
          "itemId": "panel_62",
          "dockedItems": []
     }],
     "margin": 5,
     "border": true,
     "autoScroll": true,
     "itemId": "panel_67",
     "dockedItems": [],
     "requires": ["Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.ItemcategorytypeModel", "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.UsercirclemapModel", "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.ItemtypeModel", "Airtelmdm.airtelmdm.web.mdm.controller.masterdatamanagment.mdmdomain.RequestRoutingController", "Airtelmdm.airtelmdm.shared.mdm.viewmodel.masterdatamanagment.mdmdomain.RequestRoutingViewModel", "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.RequestRoutingModel"],
     "extend": "Ext.panel.Panel",
     "viewModel": "RequestRoutingViewModel",
     "controller": "RequestRoutingController"
});