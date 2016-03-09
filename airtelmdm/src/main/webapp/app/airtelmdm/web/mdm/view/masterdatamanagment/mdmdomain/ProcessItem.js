Ext.define('Airtelmdm.airtelmdm.web.mdm.view.masterdatamanagment.mdmdomain.ProcessItem', {
     "xtype": "processItem",
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
                    "itemId": "textfield_62"
               }, {
                    "xtype": "textfield",
                    "fieldLabel": "Part Number",
                    "margin": 5,
                    "bindable": "partnumber",
                    "name": "partnumber",
                    "itemId": "textfield_7"
               }, {
                    "xtype": "textfield",
                    "fieldLabel": "Part Description",
                    "margin": 5,
                    "bindable": "partdesc",
                    "name": "partdesc",
                    "itemId": "textfield_78"
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
                    "itemId": "combo_24",
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
                    "itemId": "combo_61",
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
                    "type": "vbox"
               },
               "autoScroll": true,
               "margin": 5,
               "title": "Base Information",
               "dockedItems": [],
               "flex": 1,
               "itemId": "panel_13"
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
                    "itemId": "combo_23",
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
                    "itemId": "combo_76",
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
                    "itemId": "combo_94",
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
                    "itemId": "combo_29",
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
                    "itemId": "combo_84",
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
               "flex": 1,
               "dockedItems": [],
               "itemId": "panel_74"
          }],
          "layout": {
               "type": "hbox"
          },
          "autoScroll": true,
          "margin": 5,
          "dockedItems": [],
          "itemId": "panel_4"
     }, {
          "xtype": "panel",
          "name": "SAE1",
          "items": [{
               "xtype": "textfield",
               "fieldLabel": "Model",
               "margin": 5,
               "bindable": "model",
               "name": "model",
               "rowspan": 0,
               "colspan": 0,
               "itemId": "textfield_86"
          }, {
               "xtype": "combo",
               "name": "technology",
               "margin": 5,
               "bindable": "technology",
               "typeAhead": true,
               "queryMode": "local",
               "minChars": 1,
               "fieldLabel": "Technology",
               "displayField": "technologyid",
               "valueField": "technologyname",
               "rowspan": 0,
               "colspan": 0,
               "itemId": "combo_12",
               "store": {
                    "model": "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.TechnologyModel",
                    "autoLoad": true,
                    "autoSync": true,
                    "sorters": [{
                         "property": "technologyid",
                         "direction": "ASC"
                    }],
                    "proxy": {
                         "type": "ajax",
                         "url": "secure/Technology/findAll",
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
               "fieldLabel": "Functional Classification",
               "margin": 5,
               "bindable": "funcclassification",
               "name": "funcclassification",
               "rowspan": 0,
               "colspan": 0,
               "itemId": "textfield_76"
          }, {
               "xtype": "textfield",
               "fieldLabel": "Nature of Item",
               "margin": 5,
               "bindable": "natureofitem",
               "name": "natureofitem",
               "rowspan": 0,
               "colspan": 0,
               "itemId": "textfield_63"
          }, {
               "xtype": "textfield",
               "fieldLabel": "Network Element",
               "margin": 5,
               "bindable": "networkelemENT",
               "name": "networkelemENT",
               "rowspan": 0,
               "colspan": 0,
               "itemId": "textfield_61"
          }, {
               "xtype": "textfield",
               "fieldLabel": "A, C, S",
               "margin": 5,
               "bindable": "acs",
               "name": "acs",
               "rowspan": 0,
               "colspan": 0,
               "itemId": "textfield_7"
          }, {
               "xtype": "textfield",
               "fieldLabel": "Model/Family",
               "margin": 5,
               "bindable": "modelfamily",
               "name": "modelfamily",
               "rowspan": 0,
               "colspan": 0,
               "itemId": "textfield_31"
          }],
          "layout": {
               "type": "table",
               "columns": 2,
               "tableAttrs": {
                    "style": {
                         "width": "100%"
                    }
               }
          },
          "title": "SAE",
          "border": true,
          "margin": 5,
          "dockedItems": [],
          "itemId": "panel_37"
     }, {
          "xtype": "button",
          "name": "processitem",
          "text": "Process Item",
          "margin": 5,
          "isSubmitBtn": true,
          "itemId": "button_70",
          "listeners": {
               "click": "onprocessitemclick"
          }
     }],
     "margin": 5,
     "border": true,
     "autoScroll": true,
     "dockedItems": [],
     "itemId": "panel_72",
     "requires": ["Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.ItemmaintypeModel", "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.ItemsubtypeModel", "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.ManufacturerModel", "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.UomModel", "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.ItemcategorytypeModel", "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.ItemtypeModel", "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.SbpModel", "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.TechnologyModel", "Airtelmdm.airtelmdm.web.mdm.controller.masterdatamanagment.mdmdomain.ProcessItemController", "Airtelmdm.airtelmdm.shared.mdm.viewmodel.masterdatamanagment.mdmdomain.ProcessItemViewModel", "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.ProcessItemModel"],
     "extend": "Ext.panel.Panel",
     "viewModel": "ProcessItemViewModel",
     "controller": "ProcessItemController"
});