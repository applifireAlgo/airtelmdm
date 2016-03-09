Ext.define('Airtelmdm.airtelmdm.web.mdm.view.masterdatamanagment.mdmdomain.SearchItem', {
     "xtype": "searchItem",
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
                    "itemId": "textfield_4"
               }, {
                    "xtype": "textfield",
                    "fieldLabel": "Item Description",
                    "margin": 5,
                    "bindable": "itemdesc",
                    "name": "itemdesc",
                    "itemId": "textfield_94"
               }, {
                    "xtype": "textfield",
                    "fieldLabel": "Part Number",
                    "margin": 5,
                    "bindable": "partnumber",
                    "name": "partnumber",
                    "itemId": "textfield_97"
               }, {
                    "xtype": "textfield",
                    "fieldLabel": "Part Description",
                    "margin": 5,
                    "bindable": "partdesc",
                    "name": "partdesc",
                    "itemId": "textfield_57"
               }, {
                    "xtype": "textfield",
                    "fieldLabel": "Model",
                    "margin": 5,
                    "bindable": "model",
                    "name": "model",
                    "itemId": "textfield_79"
               }],
               "layout": {
                    "type": "vbox"
               },
               "autoScroll": true,
               "margin": 5,
               "title": "Search",
               "flex": 1,
               "dockedItems": [],
               "itemId": "panel_43"
          }, {
               "xtype": "panel",
               "items": [{
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
                    "itemId": "combo_68",
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
                    "name": "itemcategory",
                    "margin": 5,
                    "bindable": "itemcategory",
                    "typeAhead": true,
                    "queryMode": "local",
                    "minChars": 1,
                    "fieldLabel": "Item Category",
                    "displayField": "itemcategoryname",
                    "valueField": "itemcategoryid",
                    "itemId": "combo_11",
                    "store": {
                         "model": "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.ItemcategorytypeModel",
                         "autoLoad": true,
                         "autoSync": true,
                         "sorters": [{
                              "property": "itemcategoryname",
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
                    "name": "itemmaintype",
                    "margin": 5,
                    "bindable": "itemmaintype",
                    "typeAhead": true,
                    "queryMode": "local",
                    "minChars": 1,
                    "fieldLabel": "Main Item Type",
                    "displayField": "itemmaintypename",
                    "valueField": "itemmaintypeid",
                    "itemId": "combo_22",
                    "store": {
                         "model": "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.ItemmaintypeModel",
                         "autoLoad": true,
                         "autoSync": true,
                         "sorters": [{
                              "property": "itemmaintypename",
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
                    "displayField": "itemsubtypename",
                    "valueField": "itemsubtypeid",
                    "itemId": "combo_62",
                    "store": {
                         "model": "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.ItemsubtypeModel",
                         "autoLoad": true,
                         "autoSync": true,
                         "sorters": [{
                              "property": "itemsubtypename",
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
               }, {
                    "xtype": "combo",
                    "name": "technology",
                    "margin": 5,
                    "bindable": "technology",
                    "typeAhead": true,
                    "queryMode": "local",
                    "minChars": 1,
                    "fieldLabel": "Technology",
                    "displayField": "technologyname",
                    "valueField": "technologyid",
                    "itemId": "combo_11",
                    "store": {
                         "model": "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.TechnologyModel",
                         "autoLoad": true,
                         "autoSync": true,
                         "sorters": [{
                              "property": "technologyname",
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
               }],
               "layout": {
                    "type": "vbox"
               },
               "autoScroll": true,
               "margin": 5,
               "title": "Add Filters",
               "flex": 1,
               "dockedItems": [],
               "itemId": "panel_82"
          }],
          "layout": {
               "type": "hbox"
          },
          "autoScroll": true,
          "margin": 5,
          "dockedItems": [],
          "itemId": "panel_67"
     }, {
          "xtype": "button",
          "name": "search",
          "text": "Search",
          "margin": 5,
          "isSubmitBtn": true,
          "itemId": "button_50",
          "listeners": {
               "click": "onsearchclick"
          }
     }, {
          "xtype": "grids",
          "name": "searchresults",
          "title": "Search Results",
          "hiddenName": "Grid",
          "margin": 5,
          "collapseMode": "header",
          "border": true,
          "editTools": false,
          "features": [],
          "plugins": [{
               "ptype": "cellediting",
               "clicksToEdit": 1
          }],
          "columns": [{
               "xtype": "gridcolumn",
               "header": "addressId",
               "dataIndex": "addressId",
               "flex": 1
          }, {
               "xtype": "gridcolumn",
               "header": "addressTypeId",
               "dataIndex": "addressTypeId",
               "flex": 1
          }, {
               "xtype": "gridcolumn",
               "header": "addressLabel",
               "dataIndex": "addressLabel",
               "flex": 1
          }, {
               "xtype": "gridcolumn",
               "header": "address1",
               "dataIndex": "address1",
               "flex": 1
          }, {
               "xtype": "gridcolumn",
               "header": "address2",
               "dataIndex": "address2",
               "flex": 1
          }, {
               "xtype": "gridcolumn",
               "header": "address3",
               "dataIndex": "address3",
               "flex": 1
          }, {
               "xtype": "gridcolumn",
               "header": "countryId",
               "dataIndex": "countryId",
               "flex": 1
          }, {
               "xtype": "gridcolumn",
               "header": "stateId",
               "dataIndex": "stateId",
               "flex": 1
          }, {
               "xtype": "gridcolumn",
               "header": "cityId",
               "dataIndex": "cityId",
               "flex": 1
          }, {
               "xtype": "gridcolumn",
               "header": "zipcode",
               "dataIndex": "zipcode",
               "flex": 1
          }, {
               "xtype": "gridcolumn",
               "header": "latitude",
               "dataIndex": "latitude",
               "flex": 1
          }, {
               "xtype": "gridcolumn",
               "header": "longitude",
               "dataIndex": "longitude",
               "flex": 1
          }, {
               "xtype": "gridcolumn",
               "header": "createdBy",
               "dataIndex": "createdBy",
               "flex": 1
          }, {
               "xtype": "gridcolumn",
               "header": "createdDate",
               "dataIndex": "createdDate",
               "flex": 1
          }, {
               "xtype": "gridcolumn",
               "header": "updatedBy",
               "dataIndex": "updatedBy",
               "flex": 1
          }, {
               "xtype": "gridcolumn",
               "header": "updatedDate",
               "dataIndex": "updatedDate",
               "flex": 1
          }, {
               "xtype": "gridcolumn",
               "header": "versionId",
               "dataIndex": "versionId",
               "flex": 1
          }, {
               "xtype": "gridcolumn",
               "header": "activeStatus",
               "dataIndex": "activeStatus",
               "flex": 1
          }, {
               "xtype": "gridcolumn",
               "header": "txnAccessCode",
               "dataIndex": "txnAccessCode",
               "flex": 1
          }],
          "itemId": "gridpanel_9",
          "store": {
               "model": "Airtelmdm.airtelmdm.shared.mdm.model.organizationboundedcontext.location.AddressModel",
               "autoLoad": true,
               "autoSync": true,
               "proxy": {
                    "type": "ajax",
                    "url": "secure/Address/findAll",
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
          },
          "tools": [{
               "type": "refresh",
               "tooltip": "Refresh Grid Data",
               "handler": "onGridRefreshClick"
          }]
     }, {
          "xtype": "button",
          "name": "viewdetails",
          "text": "View Details",
          "margin": 5,
          "isSubmitBtn": true,
          "itemId": "button_72",
          "listeners": {
               "click": "onviewdetailsclick"
          }
     }, {
          "xtype": "button",
          "name": "createreq",
          "text": "Create Request",
          "margin": 5,
          "isSubmitBtn": true,
          "itemId": "button_30",
          "listeners": {
               "click": "oncreatereqclick"
          }
     }, {
          "xtype": "button",
          "name": "updatereq",
          "text": "Update Request",
          "margin": 5,
          "isSubmitBtn": true,
          "itemId": "button_40",
          "listeners": {
               "click": "onupdatereqclick"
          }
     }, {
          "xtype": "button",
          "name": "deletereq",
          "text": "Delete Request",
          "margin": 5,
          "isSubmitBtn": true,
          "itemId": "button_16",
          "listeners": {
               "click": "ondeletereqclick"
          }
     }],
     "margin": 5,
     "border": true,
     "autoScroll": true,
     "dockedItems": [],
     "itemId": "panel_27",
     "requires": ["Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.ItemtypeModel", "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.ItemcategorytypeModel", "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.ItemmaintypeModel", "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.ItemsubtypeModel", "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.TechnologyModel", "Airtelmdm.airtelmdm.shared.mdm.model.organizationboundedcontext.location.AddressModel", "Airtelmdm.airtelmdm.web.mdm.controller.masterdatamanagment.mdmdomain.SearchItemController", "Airtelmdm.airtelmdm.shared.mdm.viewmodel.masterdatamanagment.mdmdomain.SearchItemViewModel", "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.SearchItemModel", "Airtelmdm.view.fw.component.Grids"],
     "extend": "Ext.panel.Panel",
     "viewModel": "SearchItemViewModel",
     "controller": "SearchItemController"
});