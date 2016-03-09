Ext.define('Airtelmdm.airtelmdm.web.mdm.view.masterdatamanagment.mdmdomain.CreateRequest', {
     "xtype": "createRequest",
     "items": [{
          "xtype": "panel",
          "items": [{
               "xtype": "panel",
               "items": [{
                    "xtype": "textfield",
                    "fieldLabel": "Item Code",
                    "margin": 5,
                    "bindable": "itemcode",
                    "name": "itemcode",
                    "itemId": "textfield_23"
               }, {
                    "xtype": "textfield",
                    "fieldLabel": "Part Number",
                    "margin": 5,
                    "bindable": "partnumber",
                    "name": "partnumber",
                    "width": null,
                    "height": null,
                    "itemId": "textfield_87"
               }, {
                    "xtype": "textfield",
                    "fieldLabel": "Part Description",
                    "margin": 5,
                    "bindable": "partdesc",
                    "name": "partdesc",
                    "height": null,
                    "width": null,
                    "itemId": "textfield_21"
               }, {
                    "xtype": "combo",
                    "name": "itemmaintype",
                    "margin": 5,
                    "bindable": "itemmaintype",
                    "typeAhead": true,
                    "queryMode": "local",
                    "minChars": 1,
                    "fieldLabel": "Main Item Type",
                    "displayField": "itemmaintypeid",
                    "valueField": "itemmaintypename",
                    "itemId": "combo_68",
                    "store": {
                         "model": "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.ItemmaintypeModel",
                         "autoLoad": true,
                         "autoSync": true,
                         "sorters": [{
                              "property": "itemmaintypeid",
                              "direction": "ASC"
                         }],
                         "proxy": {
                              "type": "ajax",
                              "url": "secure/Itemmaintype/findAll",
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
                    "name": "itemsubtype",
                    "margin": 5,
                    "bindable": "itemsubtype",
                    "typeAhead": true,
                    "queryMode": "local",
                    "minChars": 1,
                    "fieldLabel": "Sub-Item Type",
                    "displayField": "itemsubtypeid",
                    "valueField": "itemsubtypename",
                    "itemId": "combo_31",
                    "store": {
                         "model": "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.ItemsubtypeModel",
                         "autoLoad": true,
                         "autoSync": true,
                         "sorters": [{
                              "property": "itemsubtypeid",
                              "direction": "ASC"
                         }],
                         "proxy": {
                              "type": "ajax",
                              "url": "secure/Itemsubtype/findAll",
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
                    "type": "vbox",
                    "align": "default"
               },
               "autoScroll": true,
               "margin": 5,
               "title": "Base Information",
               "dockedItems": [],
               "flex": 1,
               "itemId": "panel_23"
          }, {
               "xtype": "panel",
               "items": [{
                    "xtype": "combo",
                    "name": "manufacturer",
                    "margin": 5,
                    "bindable": "manufacturer",
                    "typeAhead": true,
                    "queryMode": "local",
                    "minChars": 1,
                    "fieldLabel": "Manufacturer",
                    "displayField": "manufacturerid",
                    "valueField": "manufacturername",
                    "itemId": "combo_21",
                    "store": {
                         "model": "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.ManufacturerModel",
                         "autoLoad": true,
                         "autoSync": true,
                         "sorters": [{
                              "property": "manufacturerid",
                              "direction": "ASC"
                         }],
                         "proxy": {
                              "type": "ajax",
                              "url": "secure/Manufacturer/findAll",
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
                    "name": "uom",
                    "margin": 5,
                    "bindable": "uom",
                    "typeAhead": true,
                    "queryMode": "local",
                    "minChars": 1,
                    "fieldLabel": "UOM",
                    "displayField": "uomid",
                    "valueField": "uomname",
                    "itemId": "combo_28",
                    "store": {
                         "model": "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.UomModel",
                         "autoLoad": true,
                         "autoSync": true,
                         "sorters": [{
                              "property": "uomid",
                              "direction": "ASC"
                         }],
                         "proxy": {
                              "type": "ajax",
                              "url": "secure/Uom/findAll",
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
                    "name": "itemcategory",
                    "margin": 5,
                    "bindable": "itemcategory",
                    "typeAhead": true,
                    "queryMode": "local",
                    "minChars": 1,
                    "fieldLabel": "Item Category",
                    "displayField": "itemcategoryid",
                    "valueField": "itemcategoryname",
                    "itemId": "combo_7",
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
                    "displayField": "itemtypeid",
                    "valueField": "itemtypename",
                    "itemId": "combo_70",
                    "store": {
                         "model": "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.ItemtypeModel",
                         "autoLoad": true,
                         "autoSync": true,
                         "sorters": [{
                              "property": "itemtypeid",
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
                    "name": "sbp",
                    "margin": 5,
                    "bindable": "sbp",
                    "typeAhead": true,
                    "queryMode": "local",
                    "minChars": 1,
                    "fieldLabel": "S, B, P",
                    "displayField": "sbpid",
                    "valueField": "sbpname",
                    "itemId": "combo_47",
                    "store": {
                         "model": "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.SbpModel",
                         "autoLoad": true,
                         "autoSync": true,
                         "sorters": [{
                              "property": "sbpid",
                              "direction": "ASC"
                         }],
                         "proxy": {
                              "type": "ajax",
                              "url": "secure/Sbp/findAll",
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
                    "type": "vbox"
               },
               "autoScroll": true,
               "margin": 5,
               "title": "Details",
               "dockedItems": [],
               "flex": 1,
               "itemId": "panel_95"
          }],
          "layout": {
               "type": "hbox"
          },
          "autoScroll": true,
          "margin": 5,
          "dockedItems": [],
          "itemId": "panel_66"
     }, {
          "xtype": "button",
          "name": "createrequest",
          "text": "Create Request",
          "margin": 5,
          "isSubmitBtn": true,
          "itemId": "button_56",
          "listeners": {
               "click": "oncreaterequestclick"
          }
     }],
     "margin": 5,
     "border": true,
     "autoScroll": true,
     "dockedItems": [],
     "itemId": "panel_35",
     "requires": ["Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.ItemmaintypeModel", "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.ItemsubtypeModel", "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.ManufacturerModel", "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.UomModel", "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.ItemcategorytypeModel", "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.ItemtypeModel", "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.SbpModel", "Airtelmdm.airtelmdm.web.mdm.controller.masterdatamanagment.mdmdomain.CreateRequestController", "Airtelmdm.airtelmdm.shared.mdm.viewmodel.masterdatamanagment.mdmdomain.CreateRequestViewModel", "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.CreateRequestModel"],
     "extend": "Ext.panel.Panel",
     "viewModel": "CreateRequestViewModel",
     "controller": "CreateRequestController"
});