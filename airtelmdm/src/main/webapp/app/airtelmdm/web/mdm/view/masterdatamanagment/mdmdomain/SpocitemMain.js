Ext.define('Airtelmdm.airtelmdm.web.mdm.view.masterdatamanagment.mdmdomain.SpocitemMain', {
     "extend": "Ext.tab.Panel",
     "customWidgetType": "vdTabLayout",
     "controller": "SpocitemMainController",
     "restURL": "/Spocitem",
     "defaults": {
          "split": true
     },
     "requires": ["Airtelmdm.airtelmdm.web.mdm.controller.masterdatamanagment.mdmdomain.SpocitemMainController", "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.ItemmaintypeModel", "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.ItemsubtypeModel", "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.UomModel", "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.ItemcategorytypeModel", "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.ItemtypeModel", "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.SbpModel", "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.TechnologyModel", "Airtelmdm.airtelmdm.shared.mdm.viewmodel.masterdatamanagment.mdmdomain.SpocitemViewModel"],
     "tabPosition": "bottom",
     "communicationLog": [],
     "itemId": "SpocitemFormGridContainer",
     "items": [{
          "title": "Data Browser",
          "layout": "border",
          "autoScroll": false,
          "customWidgetType": "vdBorderLayout",
          "items": [{
               "region": "center",
               "layout": "border",
               "customWidgetType": "vdBorderLayout",
               "items": [{
                    "customWidgetType": "vdFormpanel",
                    "viewModel": "SpocitemViewModel",
                    "xtype": "form",
                    "displayName": "spocitem",
                    "title": "spocitem",
                    "name": "Spocitem",
                    "itemId": "SpocitemForm",
                    "bodyPadding": 10,
                    "items": [{
                         "name": "itemid",
                         "itemId": "itemid",
                         "xtype": "textfield",
                         "customWidgetType": "vdTextfield",
                         "displayName": "Item Id",
                         "margin": "5 5 5 5",
                         "fieldLabel": "Item Id<font color='red'> *<\/font>",
                         "fieldId": "ED5A076F-0DC9-409E-9C29-7908EFBF897D",
                         "hidden": true,
                         "value": "",
                         "bindable": "itemid",
                         "bind": "{itemid}"
                    }, {
                         "name": "itemcode",
                         "itemId": "itemcode",
                         "xtype": "textfield",
                         "customWidgetType": "vdTextfield",
                         "displayName": "Item Code",
                         "margin": "5 5 5 5",
                         "fieldLabel": "Item Code<font color='red'> *<\/font>",
                         "allowBlank": false,
                         "fieldId": "65B0D740-0333-4FFF-945A-F87AECE518CB",
                         "minLength": "0",
                         "maxLength": "256",
                         "bindable": "itemcode",
                         "bind": "{itemcode}"
                    }, {
                         "name": "itemdescription",
                         "itemId": "itemdescription",
                         "xtype": "textfield",
                         "customWidgetType": "vdTextfield",
                         "displayName": "Item Description",
                         "margin": "5 5 5 5",
                         "fieldLabel": "Item Description<font color='red'> *<\/font>",
                         "allowBlank": false,
                         "fieldId": "F6D738FD-FC26-45F3-BBCB-77B7099A5964",
                         "minLength": "0",
                         "maxLength": "256",
                         "bindable": "itemdescription",
                         "bind": "{itemdescription}"
                    }, {
                         "name": "partnumber",
                         "itemId": "partnumber",
                         "xtype": "textfield",
                         "customWidgetType": "vdTextfield",
                         "displayName": "Part Number",
                         "margin": "5 5 5 5",
                         "fieldLabel": "Part Number<font color='red'> *<\/font>",
                         "allowBlank": false,
                         "fieldId": "05F0EDE1-026B-4E88-B588-09C624FA64D7",
                         "minLength": "0",
                         "maxLength": "256",
                         "bindable": "partnumber",
                         "bind": "{partnumber}"
                    }, {
                         "name": "partdescription",
                         "itemId": "partdescription",
                         "xtype": "textfield",
                         "customWidgetType": "vdTextfield",
                         "displayName": "Part Description",
                         "margin": "5 5 5 5",
                         "fieldLabel": "Part Description<font color='red'> *<\/font>",
                         "allowBlank": false,
                         "fieldId": "46494CF1-B77D-43CA-BAD3-788D87D171EE",
                         "minLength": "0",
                         "maxLength": "256",
                         "bindable": "partdescription",
                         "bind": "{partdescription}"
                    }, {
                         "name": "itemmainid",
                         "itemId": "itemmainid",
                         "xtype": "combo",
                         "customWidgetType": "vdCombo",
                         "displayName": "Main Item Type",
                         "margin": "5 5 5 5",
                         "displayField": "primaryDisplay",
                         "valueField": "primaryKey",
                         "typeAhead": true,
                         "queryMode": "local",
                         "minChars": 2,
                         "store": {
                              "data": [],
                              "model": "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.ItemmaintypeModel"
                         },
                         "allowBlank": false,
                         "fieldLabel": "Main Item Type<font color='red'> *<\/font>",
                         "fieldId": "530A6A0F-8746-4D15-9570-48A344B2BFB3",
                         "restURL": "Itemmaintype",
                         "bindable": "itemmainid",
                         "bind": "{itemmainid}"
                    }, {
                         "name": "itemsubtypeid",
                         "itemId": "itemsubtypeid",
                         "xtype": "combo",
                         "customWidgetType": "vdCombo",
                         "displayName": "Sub Item Type",
                         "margin": "5 5 5 5",
                         "displayField": "primaryDisplay",
                         "valueField": "primaryKey",
                         "typeAhead": true,
                         "queryMode": "local",
                         "minChars": 2,
                         "store": {
                              "data": [],
                              "model": "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.ItemsubtypeModel"
                         },
                         "allowBlank": false,
                         "fieldLabel": "Sub Item Type<font color='red'> *<\/font>",
                         "fieldId": "9D2B9B2F-D0CE-4D78-8E2F-C5337F6D6181",
                         "restURL": "Itemsubtype",
                         "bindable": "itemsubtypeid",
                         "bind": "{itemsubtypeid}"
                    }, {
                         "name": "uomid",
                         "itemId": "uomid",
                         "xtype": "combo",
                         "customWidgetType": "vdCombo",
                         "displayName": "UOM",
                         "margin": "5 5 5 5",
                         "displayField": "primaryDisplay",
                         "valueField": "primaryKey",
                         "typeAhead": true,
                         "queryMode": "local",
                         "minChars": 2,
                         "store": {
                              "data": [],
                              "model": "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.UomModel"
                         },
                         "allowBlank": false,
                         "fieldLabel": "UOM<font color='red'> *<\/font>",
                         "fieldId": "A1928E8D-A903-4966-9FBE-3B991237AE5E",
                         "restURL": "Uom",
                         "bindable": "uomid",
                         "bind": "{uomid}"
                    }, {
                         "name": "itemcategoryid",
                         "itemId": "itemcategoryid",
                         "xtype": "combo",
                         "customWidgetType": "vdCombo",
                         "displayName": "Item Category",
                         "margin": "5 5 5 5",
                         "displayField": "primaryDisplay",
                         "valueField": "primaryKey",
                         "typeAhead": true,
                         "queryMode": "local",
                         "minChars": 2,
                         "store": {
                              "data": [],
                              "model": "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.ItemcategorytypeModel"
                         },
                         "allowBlank": false,
                         "fieldLabel": "Item Category<font color='red'> *<\/font>",
                         "fieldId": "19F42FF9-E0B8-465C-B830-E530983EFC7E",
                         "restURL": "Itemcategorytype",
                         "bindable": "itemcategoryid",
                         "bind": "{itemcategoryid}"
                    }, {
                         "name": "itemtypeid",
                         "itemId": "itemtypeid",
                         "xtype": "combo",
                         "customWidgetType": "vdCombo",
                         "displayName": "Item Type",
                         "margin": "5 5 5 5",
                         "displayField": "primaryDisplay",
                         "valueField": "primaryKey",
                         "typeAhead": true,
                         "queryMode": "local",
                         "minChars": 2,
                         "store": {
                              "data": [],
                              "model": "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.ItemtypeModel"
                         },
                         "allowBlank": false,
                         "fieldLabel": "Item Type<font color='red'> *<\/font>",
                         "fieldId": "3C649C3E-FA71-419D-AB33-6AFD82B8AB01",
                         "restURL": "Itemtype",
                         "bindable": "itemtypeid",
                         "bind": "{itemtypeid}"
                    }, {
                         "name": "sbpid",
                         "itemId": "sbpid",
                         "xtype": "combo",
                         "customWidgetType": "vdCombo",
                         "displayName": "S, B, P",
                         "margin": "5 5 5 5",
                         "displayField": "primaryDisplay",
                         "valueField": "primaryKey",
                         "typeAhead": true,
                         "queryMode": "local",
                         "minChars": 2,
                         "store": {
                              "data": [],
                              "model": "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.SbpModel"
                         },
                         "allowBlank": false,
                         "fieldLabel": "S, B, P<font color='red'> *<\/font>",
                         "fieldId": "BC6F7CFC-31BB-4052-9C4F-BB9F677EFABC",
                         "restURL": "Sbp",
                         "bindable": "sbpid",
                         "bind": "{sbpid}"
                    }, {
                         "name": "natureofitem",
                         "itemId": "natureofitem",
                         "xtype": "textfield",
                         "customWidgetType": "vdTextfield",
                         "displayName": "Nature of Item",
                         "margin": "5 5 5 5",
                         "fieldLabel": "Nature of Item<font color='red'> *<\/font>",
                         "allowBlank": false,
                         "fieldId": "86A203E3-C97D-4749-A501-16C9546330E1",
                         "minLength": "0",
                         "maxLength": "256",
                         "bindable": "natureofitem",
                         "bind": "{natureofitem}"
                    }, {
                         "name": "networkelement",
                         "itemId": "networkelement",
                         "xtype": "textfield",
                         "customWidgetType": "vdTextfield",
                         "displayName": "Network Element",
                         "margin": "5 5 5 5",
                         "fieldLabel": "Network Element<font color='red'> *<\/font>",
                         "allowBlank": false,
                         "fieldId": "1A6D803B-4531-4E88-8EF3-CE4A95AC0B09",
                         "minLength": "0",
                         "maxLength": "256",
                         "bindable": "networkelement",
                         "bind": "{networkelement}"
                    }, {
                         "name": "model",
                         "itemId": "model",
                         "xtype": "textfield",
                         "customWidgetType": "vdTextfield",
                         "displayName": "Model",
                         "margin": "5 5 5 5",
                         "fieldLabel": "Model<font color='red'> *<\/font>",
                         "allowBlank": false,
                         "fieldId": "89CAFE38-BD37-4D83-8821-952ABC2F33EA",
                         "minLength": "0",
                         "maxLength": "256",
                         "bindable": "model",
                         "bind": "{model}"
                    }, {
                         "name": "technologyid",
                         "itemId": "technologyid",
                         "xtype": "combo",
                         "customWidgetType": "vdCombo",
                         "displayName": "Technology",
                         "margin": "5 5 5 5",
                         "displayField": "primaryDisplay",
                         "valueField": "primaryKey",
                         "typeAhead": true,
                         "queryMode": "local",
                         "minChars": 2,
                         "store": {
                              "data": [],
                              "model": "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.TechnologyModel"
                         },
                         "allowBlank": false,
                         "fieldLabel": "Technology<font color='red'> *<\/font>",
                         "fieldId": "E1CE103A-548C-46A9-82D0-2E6011CFA581",
                         "restURL": "Technology",
                         "bindable": "technologyid",
                         "bind": "{technologyid}"
                    }, {
                         "name": "funcclassification",
                         "itemId": "funcclassification",
                         "xtype": "textfield",
                         "customWidgetType": "vdTextfield",
                         "displayName": "Functional Classification",
                         "margin": "5 5 5 5",
                         "fieldLabel": "Functional Classification<font color='red'> *<\/font>",
                         "allowBlank": false,
                         "fieldId": "2A8C8193-1FDD-4C0F-A435-6D188742300B",
                         "minLength": "0",
                         "maxLength": "256",
                         "bindable": "funcclassification",
                         "bind": "{funcclassification}"
                    }, {
                         "name": "acs",
                         "itemId": "acs",
                         "xtype": "textfield",
                         "customWidgetType": "vdTextfield",
                         "displayName": "A, C, S",
                         "margin": "5 5 5 5",
                         "fieldLabel": "A, C, S<font color='red'> *<\/font>",
                         "allowBlank": false,
                         "fieldId": "E1B7D732-B71C-4500-BE9A-447C19AA5864",
                         "minLength": "0",
                         "maxLength": "256",
                         "bindable": "acs",
                         "bind": "{acs}"
                    }, {
                         "name": "inventoryitem",
                         "itemId": "inventoryitem",
                         "xtype": "checkbox",
                         "customWidgetType": "vdCheckbox",
                         "displayName": "Inventory Item (Y/N)",
                         "margin": "5 5 5 5",
                         "inputValue": true,
                         "fieldLabel": "Inventory Item (Y/N)<font color='red'> *<\/font>",
                         "allowBlank": false,
                         "fieldId": "185F16E3-E0D3-4F6B-86DB-FE9EB3FD3C6A",
                         "bindable": "inventoryitem",
                         "bind": "{inventoryitem}"
                    }, {
                         "name": "trackablealm",
                         "itemId": "trackablealm",
                         "xtype": "checkbox",
                         "customWidgetType": "vdCheckbox",
                         "displayName": "Trackable in ALM(Y/N)",
                         "margin": "5 5 5 5",
                         "inputValue": true,
                         "fieldLabel": "Trackable in ALM(Y/N)<font color='red'> *<\/font>",
                         "allowBlank": false,
                         "fieldId": "B4E63C22-E615-4EBF-AC7E-21E694C9C58C",
                         "bindable": "trackablealm",
                         "bind": "{trackablealm}"
                    }, {
                         "name": "taggable",
                         "itemId": "taggable",
                         "xtype": "checkbox",
                         "customWidgetType": "vdCheckbox",
                         "displayName": "Taggable (Y/N)",
                         "margin": "5 5 5 5",
                         "inputValue": true,
                         "fieldLabel": "Taggable (Y/N)<font color='red'> *<\/font>",
                         "allowBlank": false,
                         "fieldId": "7D9ECF9B-1770-4C68-AEFB-35C3EBA9BCF5",
                         "bindable": "taggable",
                         "bind": "{taggable}"
                    }, {
                         "name": "repairable",
                         "itemId": "repairable",
                         "xtype": "checkbox",
                         "customWidgetType": "vdCheckbox",
                         "displayName": "Repairable (Y/N)",
                         "margin": "5 5 5 5",
                         "inputValue": true,
                         "fieldLabel": "Repairable (Y/N)<font color='red'> *<\/font>",
                         "allowBlank": false,
                         "fieldId": "29304E88-9C35-437F-8F76-50A25D791A1D",
                         "bindable": "repairable",
                         "bind": "{repairable}"
                    }, {
                         "name": "serialised",
                         "itemId": "serialised",
                         "xtype": "checkbox",
                         "customWidgetType": "vdCheckbox",
                         "displayName": "Serialised (Y/N)",
                         "margin": "5 5 5 5",
                         "inputValue": true,
                         "fieldLabel": "Serialised (Y/N)<font color='red'> *<\/font>",
                         "allowBlank": false,
                         "fieldId": "B7C38864-0CF2-40C4-A6F9-032A628A6CFE",
                         "bindable": "serialised",
                         "bind": "{serialised}"
                    }, {
                         "name": "leadtime",
                         "itemId": "leadtime",
                         "xtype": "numberfield",
                         "customWidgetType": "vdNumberfield",
                         "displayName": "Lead Time",
                         "margin": "5 5 5 5",
                         "fieldLabel": "Lead Time<font color='red'> *<\/font>",
                         "allowBlank": false,
                         "fieldId": "EFAF56C9-354A-4109-A74F-21B0100080E8",
                         "minValue": "-9223372000000000000",
                         "maxValue": "9223372000000000000",
                         "bindable": "leadtime",
                         "bind": "{leadtime}"
                    }, {
                         "name": "nmsunique",
                         "itemId": "nmsunique",
                         "xtype": "textareafield",
                         "customWidgetType": "vdTextareafield",
                         "displayName": "NMS unique identifier",
                         "margin": "5 5 5 5",
                         "fieldLabel": "NMS unique identifier<font color='red'> *<\/font>",
                         "allowBlank": false,
                         "fieldId": "98C99BE0-7407-4A08-B493-4A564D7F1DE3",
                         "bindable": "nmsunique",
                         "bind": "{nmsunique}"
                    }, {
                         "name": "movable",
                         "itemId": "movable",
                         "xtype": "textfield",
                         "customWidgetType": "vdTextfield",
                         "displayName": "Moveable",
                         "margin": "5 5 5 5",
                         "fieldLabel": "Moveable<font color='red'> *<\/font>",
                         "allowBlank": false,
                         "fieldId": "38649893-0730-4B6E-95C7-971E81BC6889",
                         "minLength": "0",
                         "maxLength": "256",
                         "bindable": "movable",
                         "bind": "{movable}"
                    }, {
                         "name": "moq",
                         "itemId": "moq",
                         "xtype": "textfield",
                         "customWidgetType": "vdTextfield",
                         "displayName": "MOQ",
                         "margin": "5 5 5 5",
                         "fieldLabel": "MOQ<font color='red'> *<\/font>",
                         "allowBlank": false,
                         "fieldId": "89A63116-193E-413C-958A-1B95630D3C4E",
                         "minLength": "0",
                         "maxLength": "256",
                         "bindable": "moq",
                         "bind": "{moq}"
                    }, {
                         "name": "purchasable",
                         "itemId": "purchasable",
                         "xtype": "checkbox",
                         "customWidgetType": "vdCheckbox",
                         "displayName": "Purchasable",
                         "margin": "5 5 5 5",
                         "inputValue": true,
                         "fieldLabel": "Purchasable<font color='red'> *<\/font>",
                         "allowBlank": false,
                         "fieldId": "1449ACF8-ACA0-4B68-8503-123C020FB6A9",
                         "bindable": "purchasable",
                         "bind": "{purchasable}"
                    }, {
                         "name": "majorasset",
                         "itemId": "majorasset",
                         "xtype": "numberfield",
                         "customWidgetType": "vdNumberfield",
                         "displayName": "Major Asset Category",
                         "margin": "5 5 5 5",
                         "fieldLabel": "Major Asset Category<font color='red'> *<\/font>",
                         "allowBlank": false,
                         "fieldId": "52B9D9DA-8A82-4700-B1AF-01F3D7CB6EFA",
                         "minValue": "-9223372000000000000",
                         "maxValue": "9223372000000000000",
                         "bindable": "majorasset",
                         "bind": "{majorasset}"
                    }, {
                         "name": "minorasset",
                         "itemId": "minorasset",
                         "xtype": "numberfield",
                         "customWidgetType": "vdNumberfield",
                         "displayName": "Minor Asset Category",
                         "margin": "5 5 5 5",
                         "fieldLabel": "Minor Asset Category<font color='red'> *<\/font>",
                         "allowBlank": false,
                         "fieldId": "D895F98E-6456-4134-B520-DA80A8E823EE",
                         "minValue": "-9223372000000000000",
                         "maxValue": "9223372000000000000",
                         "bindable": "minorasset",
                         "bind": "{minorasset}"
                    }, {
                         "name": "customdutycode",
                         "itemId": "customdutycode",
                         "xtype": "textfield",
                         "customWidgetType": "vdTextfield",
                         "displayName": "Custom duty code",
                         "margin": "5 5 5 5",
                         "fieldLabel": "Custom duty code<font color='red'> *<\/font>",
                         "allowBlank": false,
                         "fieldId": "D7318070-8AD4-4915-912E-C8E69FC7FA1B",
                         "minLength": "0",
                         "maxLength": "256",
                         "bindable": "customdutycode",
                         "bind": "{customdutycode}"
                    }, {
                         "name": "glcode",
                         "itemId": "glcode",
                         "xtype": "textfield",
                         "customWidgetType": "vdTextfield",
                         "displayName": "GL Code",
                         "margin": "5 5 5 5",
                         "fieldLabel": "GL Code<font color='red'> *<\/font>",
                         "allowBlank": false,
                         "fieldId": "B0C7EA6E-E96D-4A89-889E-97FD75EF532E",
                         "minLength": "0",
                         "maxLength": "256",
                         "bindable": "glcode",
                         "bind": "{glcode}"
                    }, {
                         "name": "techinical",
                         "itemId": "techinical",
                         "xtype": "textfield",
                         "customWidgetType": "vdTextfield",
                         "displayName": "Technical or Non-Technical",
                         "margin": "5 5 5 5",
                         "fieldLabel": "Technical or Non-Technical<font color='red'> *<\/font>",
                         "allowBlank": false,
                         "fieldId": "E204C9C2-EF87-4887-84E2-100CE2298082",
                         "minLength": "0",
                         "maxLength": "256",
                         "bindable": "techinical",
                         "bind": "{techinical}"
                    }, {
                         "name": "versionId",
                         "itemId": "versionId",
                         "xtype": "numberfield",
                         "customWidgetType": "vdNumberfield",
                         "displayName": "versionId",
                         "margin": "5 5 5 5",
                         "value": "-1",
                         "fieldLabel": "versionId",
                         "fieldId": "2C819BE1-9A03-4352-AFBD-BABF79E5A8D7",
                         "bindable": "versionId",
                         "bind": "{versionId}",
                         "hidden": true
                    }],
                    "layout": "column",
                    "defaults": {
                         "columnWidth": 0.5,
                         "labelAlign": "left",
                         "labelWidth": 200
                    },
                    "autoScroll": true,
                    "dockedItems": [{
                         "xtype ": "toolbar",
                         "customWidgetType": "vdBBar",
                         "dock": "bottom",
                         "ui": "footer",
                         "isDockedItem": true,
                         "parentId": 1,
                         "customId": 218,
                         "items": [{
                              "xtype": "tbfill",
                              "customWidgetType": "vdTbFill",
                              "parentId": 218,
                              "customId": 960
                         }, {
                              "customWidgetType": "vdButton",
                              "xtype": "button",
                              "name": "saveFormButton",
                              "margin": "0 5 0 5",
                              "text": "Save",
                              "hiddenName": "button",
                              "canHaveParent": false,
                              "itemId": "saveFormButton",
                              "parentId": 218,
                              "customId": 961,
                              "listeners": {
                                   "click": "saveForm"
                              }
                         }, {
                              "customWidgetType": "vdButton",
                              "xtype": "button",
                              "name": "resetFormButton",
                              "margin": "0 5 0 5",
                              "text": "Reset",
                              "hiddenName": "button",
                              "canHaveParent": false,
                              "itemId": "resetFormButton",
                              "parentId": 218,
                              "customId": 962,
                              "listeners": {
                                   "click": "resetForm"
                              }
                         }],
                         "defaults": {}
                    }],
                    "listeners": {
                         "scope": "controller"
                    },
                    "tools": [{
                         "type": "help",
                         "tooltip": "Console",
                         "handler": "onConsoleClick"
                    }, {
                         "type": "refresh",
                         "tooltip": "Refresh Tab",
                         "handler": "init"
                    }],
                    "extend": "Ext.form.Panel",
                    "region": "center"
               }, {
                    "xtype": "panel",
                    "layout": "border",
                    "customWidgetType": "vdPanel",
                    "title": "Details Grid",
                    "columns": [{
                         "header": "Item Id",
                         "dataIndex": "itemid",
                         "hidden": true,
                         "flex": 1
                    }, {
                         "header": "primaryDisplay",
                         "dataIndex": "primaryDisplay",
                         "hidden": true
                    }, {
                         "header": "primaryKey",
                         "dataIndex": "primaryKey",
                         "hidden": true
                    }, {
                         "header": "Item Code",
                         "dataIndex": "itemcode",
                         "flex": 1
                    }, {
                         "header": "Item Description",
                         "dataIndex": "itemdescription",
                         "flex": 1
                    }, {
                         "header": "Part Number",
                         "dataIndex": "partnumber",
                         "flex": 1
                    }, {
                         "header": "Part Description",
                         "dataIndex": "partdescription",
                         "flex": 1
                    }, {
                         "header": "Main Item Type",
                         "dataIndex": "itemmainid",
                         "renderer": "renderFormValue",
                         "flex": 1
                    }, {
                         "header": "Sub Item Type",
                         "dataIndex": "itemsubtypeid",
                         "renderer": "renderFormValue",
                         "flex": 1
                    }, {
                         "header": "UOM",
                         "dataIndex": "uomid",
                         "renderer": "renderFormValue",
                         "flex": 1
                    }, {
                         "header": "Item Category",
                         "dataIndex": "itemcategoryid",
                         "renderer": "renderFormValue",
                         "flex": 1
                    }, {
                         "header": "Item Type",
                         "dataIndex": "itemtypeid",
                         "renderer": "renderFormValue",
                         "flex": 1
                    }, {
                         "header": "S, B, P",
                         "dataIndex": "sbpid",
                         "renderer": "renderFormValue",
                         "flex": 1
                    }, {
                         "header": "Nature of Item",
                         "dataIndex": "natureofitem",
                         "flex": 1
                    }, {
                         "header": "Network Element",
                         "dataIndex": "networkelement",
                         "flex": 1
                    }, {
                         "header": "Model",
                         "dataIndex": "model",
                         "flex": 1
                    }, {
                         "header": "Technology",
                         "dataIndex": "technologyid",
                         "renderer": "renderFormValue",
                         "flex": 1
                    }, {
                         "header": "Functional Classification",
                         "dataIndex": "funcclassification",
                         "flex": 1
                    }, {
                         "header": "A, C, S",
                         "dataIndex": "acs",
                         "flex": 1
                    }, {
                         "header": "Inventory Item (Y/N)",
                         "dataIndex": "inventoryitem",
                         "flex": 1
                    }, {
                         "header": "Trackable in ALM(Y/N)",
                         "dataIndex": "trackablealm",
                         "flex": 1
                    }, {
                         "header": "Taggable (Y/N)",
                         "dataIndex": "taggable",
                         "flex": 1
                    }, {
                         "header": "Repairable (Y/N)",
                         "dataIndex": "repairable",
                         "flex": 1
                    }, {
                         "header": "Serialised (Y/N)",
                         "dataIndex": "serialised",
                         "flex": 1
                    }, {
                         "header": "Lead Time",
                         "dataIndex": "leadtime",
                         "flex": 1
                    }, {
                         "header": "NMS unique identifier",
                         "dataIndex": "nmsunique",
                         "flex": 1
                    }, {
                         "header": "Moveable",
                         "dataIndex": "movable",
                         "flex": 1
                    }, {
                         "header": "MOQ",
                         "dataIndex": "moq",
                         "flex": 1
                    }, {
                         "header": "Purchasable",
                         "dataIndex": "purchasable",
                         "flex": 1
                    }, {
                         "header": "Major Asset Category",
                         "dataIndex": "majorasset",
                         "flex": 1
                    }, {
                         "header": "Minor Asset Category",
                         "dataIndex": "minorasset",
                         "flex": 1
                    }, {
                         "header": "Custom duty code",
                         "dataIndex": "customdutycode",
                         "flex": 1
                    }, {
                         "header": "GL Code",
                         "dataIndex": "glcode",
                         "flex": 1
                    }, {
                         "header": "Technical or Non-Technical",
                         "dataIndex": "techinical",
                         "flex": 1
                    }, {
                         "header": "createdBy",
                         "dataIndex": "createdBy",
                         "hidden": true,
                         "flex": 1
                    }, {
                         "header": "createdDate",
                         "dataIndex": "createdDate",
                         "hidden": true,
                         "flex": 1
                    }, {
                         "header": "updatedBy",
                         "dataIndex": "updatedBy",
                         "hidden": true,
                         "flex": 1
                    }, {
                         "header": "updatedDate",
                         "dataIndex": "updatedDate",
                         "hidden": true,
                         "flex": 1
                    }, {
                         "header": "versionId",
                         "dataIndex": "versionId",
                         "hidden": true,
                         "flex": 1
                    }, {
                         "header": "activeStatus",
                         "dataIndex": "activeStatus",
                         "hidden": true,
                         "flex": 1
                    }, {
                         "header": "txnAccessCode",
                         "dataIndex": "txnAccessCode",
                         "hidden": true,
                         "flex": 1
                    }, {
                         "xtype": "actioncolumn",
                         "customWidgetType": "vdActionColumn",
                         "width": 30,
                         "sortable": false,
                         "menuDisable": true,
                         "items": [{
                              "icon": "images/delete.gif",
                              "tooltip": "Delete Record",
                              "handler": "onDeleteActionColumnClickMainGrid"
                         }]
                    }],
                    "items": [{
                         "region": "center",
                         "xtype": "gridpanel",
                         "customWidgetType": "vdGrid",
                         "displayName": "spocitem",
                         "name": "SpocitemGrid",
                         "itemId": "SpocitemGrid",
                         "restURL": "/Spocitem",
                         "store": [],
                         "bodyPadding": 10,
                         "dockedItems": [{
                              "xtype": "toolbar",
                              "dock": "top",
                              "items": [{
                                   "xtype": "triggerfield",
                                   "emptyText": "search",
                                   "triggerCls": "",
                                   "listeners": {
                                        "change": "onTriggerfieldChange",
                                        "buffer": 250
                                   }
                              }]
                         }],
                         "columns": [{
                              "header": "Item Id",
                              "dataIndex": "itemid",
                              "hidden": true,
                              "flex": 1
                         }, {
                              "header": "primaryDisplay",
                              "dataIndex": "primaryDisplay",
                              "hidden": true
                         }, {
                              "header": "primaryKey",
                              "dataIndex": "primaryKey",
                              "hidden": true
                         }, {
                              "header": "Item Code",
                              "dataIndex": "itemcode",
                              "flex": 1
                         }, {
                              "header": "Item Description",
                              "dataIndex": "itemdescription",
                              "flex": 1
                         }, {
                              "header": "Part Number",
                              "dataIndex": "partnumber",
                              "flex": 1
                         }, {
                              "header": "Part Description",
                              "dataIndex": "partdescription",
                              "flex": 1
                         }, {
                              "header": "Main Item Type",
                              "dataIndex": "itemmainid",
                              "renderer": "renderFormValue",
                              "flex": 1
                         }, {
                              "header": "Sub Item Type",
                              "dataIndex": "itemsubtypeid",
                              "renderer": "renderFormValue",
                              "flex": 1
                         }, {
                              "header": "UOM",
                              "dataIndex": "uomid",
                              "renderer": "renderFormValue",
                              "flex": 1
                         }, {
                              "header": "Item Category",
                              "dataIndex": "itemcategoryid",
                              "renderer": "renderFormValue",
                              "flex": 1
                         }, {
                              "header": "Item Type",
                              "dataIndex": "itemtypeid",
                              "renderer": "renderFormValue",
                              "flex": 1
                         }, {
                              "header": "S, B, P",
                              "dataIndex": "sbpid",
                              "renderer": "renderFormValue",
                              "flex": 1
                         }, {
                              "header": "Nature of Item",
                              "dataIndex": "natureofitem",
                              "flex": 1
                         }, {
                              "header": "Network Element",
                              "dataIndex": "networkelement",
                              "flex": 1
                         }, {
                              "header": "Model",
                              "dataIndex": "model",
                              "flex": 1
                         }, {
                              "header": "Technology",
                              "dataIndex": "technologyid",
                              "renderer": "renderFormValue",
                              "flex": 1
                         }, {
                              "header": "Functional Classification",
                              "dataIndex": "funcclassification",
                              "flex": 1
                         }, {
                              "header": "A, C, S",
                              "dataIndex": "acs",
                              "flex": 1
                         }, {
                              "header": "Inventory Item (Y/N)",
                              "dataIndex": "inventoryitem",
                              "flex": 1
                         }, {
                              "header": "Trackable in ALM(Y/N)",
                              "dataIndex": "trackablealm",
                              "flex": 1
                         }, {
                              "header": "Taggable (Y/N)",
                              "dataIndex": "taggable",
                              "flex": 1
                         }, {
                              "header": "Repairable (Y/N)",
                              "dataIndex": "repairable",
                              "flex": 1
                         }, {
                              "header": "Serialised (Y/N)",
                              "dataIndex": "serialised",
                              "flex": 1
                         }, {
                              "header": "Lead Time",
                              "dataIndex": "leadtime",
                              "flex": 1
                         }, {
                              "header": "NMS unique identifier",
                              "dataIndex": "nmsunique",
                              "flex": 1
                         }, {
                              "header": "Moveable",
                              "dataIndex": "movable",
                              "flex": 1
                         }, {
                              "header": "MOQ",
                              "dataIndex": "moq",
                              "flex": 1
                         }, {
                              "header": "Purchasable",
                              "dataIndex": "purchasable",
                              "flex": 1
                         }, {
                              "header": "Major Asset Category",
                              "dataIndex": "majorasset",
                              "flex": 1
                         }, {
                              "header": "Minor Asset Category",
                              "dataIndex": "minorasset",
                              "flex": 1
                         }, {
                              "header": "Custom duty code",
                              "dataIndex": "customdutycode",
                              "flex": 1
                         }, {
                              "header": "GL Code",
                              "dataIndex": "glcode",
                              "flex": 1
                         }, {
                              "header": "Technical or Non-Technical",
                              "dataIndex": "techinical",
                              "flex": 1
                         }, {
                              "header": "createdBy",
                              "dataIndex": "createdBy",
                              "hidden": true,
                              "flex": 1
                         }, {
                              "header": "createdDate",
                              "dataIndex": "createdDate",
                              "hidden": true,
                              "flex": 1
                         }, {
                              "header": "updatedBy",
                              "dataIndex": "updatedBy",
                              "hidden": true,
                              "flex": 1
                         }, {
                              "header": "updatedDate",
                              "dataIndex": "updatedDate",
                              "hidden": true,
                              "flex": 1
                         }, {
                              "header": "versionId",
                              "dataIndex": "versionId",
                              "hidden": true,
                              "flex": 1
                         }, {
                              "header": "activeStatus",
                              "dataIndex": "activeStatus",
                              "hidden": true,
                              "flex": 1
                         }, {
                              "header": "txnAccessCode",
                              "dataIndex": "txnAccessCode",
                              "hidden": true,
                              "flex": 1
                         }, {
                              "xtype": "actioncolumn",
                              "customWidgetType": "vdActionColumn",
                              "width": 30,
                              "sortable": false,
                              "menuDisable": true,
                              "items": [{
                                   "icon": "images/delete.gif",
                                   "tooltip": "Delete Record",
                                   "handler": "onDeleteActionColumnClickMainGrid"
                              }]
                         }],
                         "listeners": {
                              "itemclick": "onGridItemClick"
                         }
                    }],
                    "tools": [{
                         "type": "refresh",
                         "tooltip": "Refresh Grid Data",
                         "handler": "onGridRefreshClick"
                    }],
                    "collapsible": true,
                    "titleCollapse": true,
                    "collapseMode": "header",
                    "region": "south",
                    "height": "40%"
               }]
          }]
     }, {
          "title": "Add New",
          "itemId": "addNewForm",
          "layout": "border",
          "customWidgetType": "vdBorderLayout",
          "autoScroll": false,
          "items": [{
               "customWidgetType": "vdFormpanel",
               "viewModel": "SpocitemViewModel",
               "xtype": "form",
               "displayName": "spocitem",
               "title": "spocitem",
               "name": "Spocitem",
               "itemId": "SpocitemForm",
               "bodyPadding": 10,
               "items": [{
                    "name": "itemid",
                    "itemId": "itemid",
                    "xtype": "textfield",
                    "customWidgetType": "vdTextfield",
                    "displayName": "Item Id",
                    "margin": "5 5 5 5",
                    "fieldLabel": "Item Id<font color='red'> *<\/font>",
                    "fieldId": "ED5A076F-0DC9-409E-9C29-7908EFBF897D",
                    "hidden": true,
                    "value": "",
                    "bindable": "itemid",
                    "bind": "{itemid}"
               }, {
                    "name": "itemcode",
                    "itemId": "itemcode",
                    "xtype": "textfield",
                    "customWidgetType": "vdTextfield",
                    "displayName": "Item Code",
                    "margin": "5 5 5 5",
                    "fieldLabel": "Item Code<font color='red'> *<\/font>",
                    "allowBlank": false,
                    "fieldId": "65B0D740-0333-4FFF-945A-F87AECE518CB",
                    "minLength": "0",
                    "maxLength": "256",
                    "bindable": "itemcode",
                    "bind": "{itemcode}"
               }, {
                    "name": "itemdescription",
                    "itemId": "itemdescription",
                    "xtype": "textfield",
                    "customWidgetType": "vdTextfield",
                    "displayName": "Item Description",
                    "margin": "5 5 5 5",
                    "fieldLabel": "Item Description<font color='red'> *<\/font>",
                    "allowBlank": false,
                    "fieldId": "F6D738FD-FC26-45F3-BBCB-77B7099A5964",
                    "minLength": "0",
                    "maxLength": "256",
                    "bindable": "itemdescription",
                    "bind": "{itemdescription}"
               }, {
                    "name": "partnumber",
                    "itemId": "partnumber",
                    "xtype": "textfield",
                    "customWidgetType": "vdTextfield",
                    "displayName": "Part Number",
                    "margin": "5 5 5 5",
                    "fieldLabel": "Part Number<font color='red'> *<\/font>",
                    "allowBlank": false,
                    "fieldId": "05F0EDE1-026B-4E88-B588-09C624FA64D7",
                    "minLength": "0",
                    "maxLength": "256",
                    "bindable": "partnumber",
                    "bind": "{partnumber}"
               }, {
                    "name": "partdescription",
                    "itemId": "partdescription",
                    "xtype": "textfield",
                    "customWidgetType": "vdTextfield",
                    "displayName": "Part Description",
                    "margin": "5 5 5 5",
                    "fieldLabel": "Part Description<font color='red'> *<\/font>",
                    "allowBlank": false,
                    "fieldId": "46494CF1-B77D-43CA-BAD3-788D87D171EE",
                    "minLength": "0",
                    "maxLength": "256",
                    "bindable": "partdescription",
                    "bind": "{partdescription}"
               }, {
                    "name": "itemmainid",
                    "itemId": "itemmainid",
                    "xtype": "combo",
                    "customWidgetType": "vdCombo",
                    "displayName": "Main Item Type",
                    "margin": "5 5 5 5",
                    "displayField": "primaryDisplay",
                    "valueField": "primaryKey",
                    "typeAhead": true,
                    "queryMode": "local",
                    "minChars": 2,
                    "store": {
                         "data": [],
                         "model": "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.ItemmaintypeModel"
                    },
                    "allowBlank": false,
                    "fieldLabel": "Main Item Type<font color='red'> *<\/font>",
                    "fieldId": "530A6A0F-8746-4D15-9570-48A344B2BFB3",
                    "restURL": "Itemmaintype",
                    "bindable": "itemmainid",
                    "bind": "{itemmainid}"
               }, {
                    "name": "itemsubtypeid",
                    "itemId": "itemsubtypeid",
                    "xtype": "combo",
                    "customWidgetType": "vdCombo",
                    "displayName": "Sub Item Type",
                    "margin": "5 5 5 5",
                    "displayField": "primaryDisplay",
                    "valueField": "primaryKey",
                    "typeAhead": true,
                    "queryMode": "local",
                    "minChars": 2,
                    "store": {
                         "data": [],
                         "model": "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.ItemsubtypeModel"
                    },
                    "allowBlank": false,
                    "fieldLabel": "Sub Item Type<font color='red'> *<\/font>",
                    "fieldId": "9D2B9B2F-D0CE-4D78-8E2F-C5337F6D6181",
                    "restURL": "Itemsubtype",
                    "bindable": "itemsubtypeid",
                    "bind": "{itemsubtypeid}"
               }, {
                    "name": "uomid",
                    "itemId": "uomid",
                    "xtype": "combo",
                    "customWidgetType": "vdCombo",
                    "displayName": "UOM",
                    "margin": "5 5 5 5",
                    "displayField": "primaryDisplay",
                    "valueField": "primaryKey",
                    "typeAhead": true,
                    "queryMode": "local",
                    "minChars": 2,
                    "store": {
                         "data": [],
                         "model": "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.UomModel"
                    },
                    "allowBlank": false,
                    "fieldLabel": "UOM<font color='red'> *<\/font>",
                    "fieldId": "A1928E8D-A903-4966-9FBE-3B991237AE5E",
                    "restURL": "Uom",
                    "bindable": "uomid",
                    "bind": "{uomid}"
               }, {
                    "name": "itemcategoryid",
                    "itemId": "itemcategoryid",
                    "xtype": "combo",
                    "customWidgetType": "vdCombo",
                    "displayName": "Item Category",
                    "margin": "5 5 5 5",
                    "displayField": "primaryDisplay",
                    "valueField": "primaryKey",
                    "typeAhead": true,
                    "queryMode": "local",
                    "minChars": 2,
                    "store": {
                         "data": [],
                         "model": "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.ItemcategorytypeModel"
                    },
                    "allowBlank": false,
                    "fieldLabel": "Item Category<font color='red'> *<\/font>",
                    "fieldId": "19F42FF9-E0B8-465C-B830-E530983EFC7E",
                    "restURL": "Itemcategorytype",
                    "bindable": "itemcategoryid",
                    "bind": "{itemcategoryid}"
               }, {
                    "name": "itemtypeid",
                    "itemId": "itemtypeid",
                    "xtype": "combo",
                    "customWidgetType": "vdCombo",
                    "displayName": "Item Type",
                    "margin": "5 5 5 5",
                    "displayField": "primaryDisplay",
                    "valueField": "primaryKey",
                    "typeAhead": true,
                    "queryMode": "local",
                    "minChars": 2,
                    "store": {
                         "data": [],
                         "model": "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.ItemtypeModel"
                    },
                    "allowBlank": false,
                    "fieldLabel": "Item Type<font color='red'> *<\/font>",
                    "fieldId": "3C649C3E-FA71-419D-AB33-6AFD82B8AB01",
                    "restURL": "Itemtype",
                    "bindable": "itemtypeid",
                    "bind": "{itemtypeid}"
               }, {
                    "name": "sbpid",
                    "itemId": "sbpid",
                    "xtype": "combo",
                    "customWidgetType": "vdCombo",
                    "displayName": "S, B, P",
                    "margin": "5 5 5 5",
                    "displayField": "primaryDisplay",
                    "valueField": "primaryKey",
                    "typeAhead": true,
                    "queryMode": "local",
                    "minChars": 2,
                    "store": {
                         "data": [],
                         "model": "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.SbpModel"
                    },
                    "allowBlank": false,
                    "fieldLabel": "S, B, P<font color='red'> *<\/font>",
                    "fieldId": "BC6F7CFC-31BB-4052-9C4F-BB9F677EFABC",
                    "restURL": "Sbp",
                    "bindable": "sbpid",
                    "bind": "{sbpid}"
               }, {
                    "name": "natureofitem",
                    "itemId": "natureofitem",
                    "xtype": "textfield",
                    "customWidgetType": "vdTextfield",
                    "displayName": "Nature of Item",
                    "margin": "5 5 5 5",
                    "fieldLabel": "Nature of Item<font color='red'> *<\/font>",
                    "allowBlank": false,
                    "fieldId": "86A203E3-C97D-4749-A501-16C9546330E1",
                    "minLength": "0",
                    "maxLength": "256",
                    "bindable": "natureofitem",
                    "bind": "{natureofitem}"
               }, {
                    "name": "networkelement",
                    "itemId": "networkelement",
                    "xtype": "textfield",
                    "customWidgetType": "vdTextfield",
                    "displayName": "Network Element",
                    "margin": "5 5 5 5",
                    "fieldLabel": "Network Element<font color='red'> *<\/font>",
                    "allowBlank": false,
                    "fieldId": "1A6D803B-4531-4E88-8EF3-CE4A95AC0B09",
                    "minLength": "0",
                    "maxLength": "256",
                    "bindable": "networkelement",
                    "bind": "{networkelement}"
               }, {
                    "name": "model",
                    "itemId": "model",
                    "xtype": "textfield",
                    "customWidgetType": "vdTextfield",
                    "displayName": "Model",
                    "margin": "5 5 5 5",
                    "fieldLabel": "Model<font color='red'> *<\/font>",
                    "allowBlank": false,
                    "fieldId": "89CAFE38-BD37-4D83-8821-952ABC2F33EA",
                    "minLength": "0",
                    "maxLength": "256",
                    "bindable": "model",
                    "bind": "{model}"
               }, {
                    "name": "technologyid",
                    "itemId": "technologyid",
                    "xtype": "combo",
                    "customWidgetType": "vdCombo",
                    "displayName": "Technology",
                    "margin": "5 5 5 5",
                    "displayField": "primaryDisplay",
                    "valueField": "primaryKey",
                    "typeAhead": true,
                    "queryMode": "local",
                    "minChars": 2,
                    "store": {
                         "data": [],
                         "model": "Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.TechnologyModel"
                    },
                    "allowBlank": false,
                    "fieldLabel": "Technology<font color='red'> *<\/font>",
                    "fieldId": "E1CE103A-548C-46A9-82D0-2E6011CFA581",
                    "restURL": "Technology",
                    "bindable": "technologyid",
                    "bind": "{technologyid}"
               }, {
                    "name": "funcclassification",
                    "itemId": "funcclassification",
                    "xtype": "textfield",
                    "customWidgetType": "vdTextfield",
                    "displayName": "Functional Classification",
                    "margin": "5 5 5 5",
                    "fieldLabel": "Functional Classification<font color='red'> *<\/font>",
                    "allowBlank": false,
                    "fieldId": "2A8C8193-1FDD-4C0F-A435-6D188742300B",
                    "minLength": "0",
                    "maxLength": "256",
                    "bindable": "funcclassification",
                    "bind": "{funcclassification}"
               }, {
                    "name": "acs",
                    "itemId": "acs",
                    "xtype": "textfield",
                    "customWidgetType": "vdTextfield",
                    "displayName": "A, C, S",
                    "margin": "5 5 5 5",
                    "fieldLabel": "A, C, S<font color='red'> *<\/font>",
                    "allowBlank": false,
                    "fieldId": "E1B7D732-B71C-4500-BE9A-447C19AA5864",
                    "minLength": "0",
                    "maxLength": "256",
                    "bindable": "acs",
                    "bind": "{acs}"
               }, {
                    "name": "inventoryitem",
                    "itemId": "inventoryitem",
                    "xtype": "checkbox",
                    "customWidgetType": "vdCheckbox",
                    "displayName": "Inventory Item (Y/N)",
                    "margin": "5 5 5 5",
                    "inputValue": true,
                    "fieldLabel": "Inventory Item (Y/N)<font color='red'> *<\/font>",
                    "allowBlank": false,
                    "fieldId": "185F16E3-E0D3-4F6B-86DB-FE9EB3FD3C6A",
                    "bindable": "inventoryitem",
                    "bind": "{inventoryitem}"
               }, {
                    "name": "trackablealm",
                    "itemId": "trackablealm",
                    "xtype": "checkbox",
                    "customWidgetType": "vdCheckbox",
                    "displayName": "Trackable in ALM(Y/N)",
                    "margin": "5 5 5 5",
                    "inputValue": true,
                    "fieldLabel": "Trackable in ALM(Y/N)<font color='red'> *<\/font>",
                    "allowBlank": false,
                    "fieldId": "B4E63C22-E615-4EBF-AC7E-21E694C9C58C",
                    "bindable": "trackablealm",
                    "bind": "{trackablealm}"
               }, {
                    "name": "taggable",
                    "itemId": "taggable",
                    "xtype": "checkbox",
                    "customWidgetType": "vdCheckbox",
                    "displayName": "Taggable (Y/N)",
                    "margin": "5 5 5 5",
                    "inputValue": true,
                    "fieldLabel": "Taggable (Y/N)<font color='red'> *<\/font>",
                    "allowBlank": false,
                    "fieldId": "7D9ECF9B-1770-4C68-AEFB-35C3EBA9BCF5",
                    "bindable": "taggable",
                    "bind": "{taggable}"
               }, {
                    "name": "repairable",
                    "itemId": "repairable",
                    "xtype": "checkbox",
                    "customWidgetType": "vdCheckbox",
                    "displayName": "Repairable (Y/N)",
                    "margin": "5 5 5 5",
                    "inputValue": true,
                    "fieldLabel": "Repairable (Y/N)<font color='red'> *<\/font>",
                    "allowBlank": false,
                    "fieldId": "29304E88-9C35-437F-8F76-50A25D791A1D",
                    "bindable": "repairable",
                    "bind": "{repairable}"
               }, {
                    "name": "serialised",
                    "itemId": "serialised",
                    "xtype": "checkbox",
                    "customWidgetType": "vdCheckbox",
                    "displayName": "Serialised (Y/N)",
                    "margin": "5 5 5 5",
                    "inputValue": true,
                    "fieldLabel": "Serialised (Y/N)<font color='red'> *<\/font>",
                    "allowBlank": false,
                    "fieldId": "B7C38864-0CF2-40C4-A6F9-032A628A6CFE",
                    "bindable": "serialised",
                    "bind": "{serialised}"
               }, {
                    "name": "leadtime",
                    "itemId": "leadtime",
                    "xtype": "numberfield",
                    "customWidgetType": "vdNumberfield",
                    "displayName": "Lead Time",
                    "margin": "5 5 5 5",
                    "fieldLabel": "Lead Time<font color='red'> *<\/font>",
                    "allowBlank": false,
                    "fieldId": "EFAF56C9-354A-4109-A74F-21B0100080E8",
                    "minValue": "-9223372000000000000",
                    "maxValue": "9223372000000000000",
                    "bindable": "leadtime",
                    "bind": "{leadtime}"
               }, {
                    "name": "nmsunique",
                    "itemId": "nmsunique",
                    "xtype": "textareafield",
                    "customWidgetType": "vdTextareafield",
                    "displayName": "NMS unique identifier",
                    "margin": "5 5 5 5",
                    "fieldLabel": "NMS unique identifier<font color='red'> *<\/font>",
                    "allowBlank": false,
                    "fieldId": "98C99BE0-7407-4A08-B493-4A564D7F1DE3",
                    "bindable": "nmsunique",
                    "bind": "{nmsunique}"
               }, {
                    "name": "movable",
                    "itemId": "movable",
                    "xtype": "textfield",
                    "customWidgetType": "vdTextfield",
                    "displayName": "Moveable",
                    "margin": "5 5 5 5",
                    "fieldLabel": "Moveable<font color='red'> *<\/font>",
                    "allowBlank": false,
                    "fieldId": "38649893-0730-4B6E-95C7-971E81BC6889",
                    "minLength": "0",
                    "maxLength": "256",
                    "bindable": "movable",
                    "bind": "{movable}"
               }, {
                    "name": "moq",
                    "itemId": "moq",
                    "xtype": "textfield",
                    "customWidgetType": "vdTextfield",
                    "displayName": "MOQ",
                    "margin": "5 5 5 5",
                    "fieldLabel": "MOQ<font color='red'> *<\/font>",
                    "allowBlank": false,
                    "fieldId": "89A63116-193E-413C-958A-1B95630D3C4E",
                    "minLength": "0",
                    "maxLength": "256",
                    "bindable": "moq",
                    "bind": "{moq}"
               }, {
                    "name": "purchasable",
                    "itemId": "purchasable",
                    "xtype": "checkbox",
                    "customWidgetType": "vdCheckbox",
                    "displayName": "Purchasable",
                    "margin": "5 5 5 5",
                    "inputValue": true,
                    "fieldLabel": "Purchasable<font color='red'> *<\/font>",
                    "allowBlank": false,
                    "fieldId": "1449ACF8-ACA0-4B68-8503-123C020FB6A9",
                    "bindable": "purchasable",
                    "bind": "{purchasable}"
               }, {
                    "name": "majorasset",
                    "itemId": "majorasset",
                    "xtype": "numberfield",
                    "customWidgetType": "vdNumberfield",
                    "displayName": "Major Asset Category",
                    "margin": "5 5 5 5",
                    "fieldLabel": "Major Asset Category<font color='red'> *<\/font>",
                    "allowBlank": false,
                    "fieldId": "52B9D9DA-8A82-4700-B1AF-01F3D7CB6EFA",
                    "minValue": "-9223372000000000000",
                    "maxValue": "9223372000000000000",
                    "bindable": "majorasset",
                    "bind": "{majorasset}"
               }, {
                    "name": "minorasset",
                    "itemId": "minorasset",
                    "xtype": "numberfield",
                    "customWidgetType": "vdNumberfield",
                    "displayName": "Minor Asset Category",
                    "margin": "5 5 5 5",
                    "fieldLabel": "Minor Asset Category<font color='red'> *<\/font>",
                    "allowBlank": false,
                    "fieldId": "D895F98E-6456-4134-B520-DA80A8E823EE",
                    "minValue": "-9223372000000000000",
                    "maxValue": "9223372000000000000",
                    "bindable": "minorasset",
                    "bind": "{minorasset}"
               }, {
                    "name": "customdutycode",
                    "itemId": "customdutycode",
                    "xtype": "textfield",
                    "customWidgetType": "vdTextfield",
                    "displayName": "Custom duty code",
                    "margin": "5 5 5 5",
                    "fieldLabel": "Custom duty code<font color='red'> *<\/font>",
                    "allowBlank": false,
                    "fieldId": "D7318070-8AD4-4915-912E-C8E69FC7FA1B",
                    "minLength": "0",
                    "maxLength": "256",
                    "bindable": "customdutycode",
                    "bind": "{customdutycode}"
               }, {
                    "name": "glcode",
                    "itemId": "glcode",
                    "xtype": "textfield",
                    "customWidgetType": "vdTextfield",
                    "displayName": "GL Code",
                    "margin": "5 5 5 5",
                    "fieldLabel": "GL Code<font color='red'> *<\/font>",
                    "allowBlank": false,
                    "fieldId": "B0C7EA6E-E96D-4A89-889E-97FD75EF532E",
                    "minLength": "0",
                    "maxLength": "256",
                    "bindable": "glcode",
                    "bind": "{glcode}"
               }, {
                    "name": "techinical",
                    "itemId": "techinical",
                    "xtype": "textfield",
                    "customWidgetType": "vdTextfield",
                    "displayName": "Technical or Non-Technical",
                    "margin": "5 5 5 5",
                    "fieldLabel": "Technical or Non-Technical<font color='red'> *<\/font>",
                    "allowBlank": false,
                    "fieldId": "E204C9C2-EF87-4887-84E2-100CE2298082",
                    "minLength": "0",
                    "maxLength": "256",
                    "bindable": "techinical",
                    "bind": "{techinical}"
               }, {
                    "name": "versionId",
                    "itemId": "versionId",
                    "xtype": "numberfield",
                    "customWidgetType": "vdNumberfield",
                    "displayName": "versionId",
                    "margin": "5 5 5 5",
                    "value": "-1",
                    "fieldLabel": "versionId",
                    "fieldId": "2C819BE1-9A03-4352-AFBD-BABF79E5A8D7",
                    "bindable": "versionId",
                    "bind": "{versionId}",
                    "hidden": true
               }],
               "layout": "column",
               "defaults": {
                    "columnWidth": 0.5,
                    "labelAlign": "left",
                    "labelWidth": 200
               },
               "autoScroll": true,
               "dockedItems": [{
                    "xtype ": "toolbar",
                    "customWidgetType": "vdBBar",
                    "dock": "bottom",
                    "ui": "footer",
                    "isDockedItem": true,
                    "parentId": 1,
                    "customId": 218,
                    "items": [{
                         "xtype": "tbfill",
                         "customWidgetType": "vdTbFill",
                         "parentId": 218,
                         "customId": 960
                    }, {
                         "customWidgetType": "vdButton",
                         "xtype": "button",
                         "name": "saveFormButton",
                         "margin": "0 5 0 5",
                         "text": "Save",
                         "hiddenName": "button",
                         "canHaveParent": false,
                         "itemId": "saveFormButton",
                         "parentId": 218,
                         "customId": 961,
                         "listeners": {
                              "click": "saveForm"
                         }
                    }, {
                         "customWidgetType": "vdButton",
                         "xtype": "button",
                         "name": "resetFormButton",
                         "margin": "0 5 0 5",
                         "text": "Reset",
                         "hiddenName": "button",
                         "canHaveParent": false,
                         "itemId": "resetFormButton",
                         "parentId": 218,
                         "customId": 962,
                         "listeners": {
                              "click": "resetForm"
                         }
                    }],
                    "defaults": {}
               }],
               "listeners": {
                    "scope": "controller"
               },
               "tools": [{
                    "type": "help",
                    "tooltip": "Console",
                    "handler": "onConsoleClick"
               }, {
                    "type": "refresh",
                    "tooltip": "Refresh Tab",
                    "handler": "init"
               }],
               "extend": "Ext.form.Panel",
               "region": "center"
          }]
     }]
});