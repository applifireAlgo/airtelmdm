Ext.define('Airtelmdm.airtelmdm.web.mdm.view.aaaboundedcontext.authentication.QuestionMain', {
     "extend": "Ext.tab.Panel",
     "customWidgetType": "vdTabLayout",
     "autoScroll": false,
     "controller": "QuestionMainController",
     "restURL": "/Question",
     "defaults": {
          "split": true
     },
     "requires": ["Airtelmdm.airtelmdm.shared.mdm.model.aaaboundedcontext.authentication.QuestionModel", "Airtelmdm.airtelmdm.web.mdm.controller.aaaboundedcontext.authentication.QuestionMainController", "Airtelmdm.airtelmdm.shared.mdm.viewmodel.aaaboundedcontext.authentication.QuestionViewModel"],
     "communicationLog": [],
     "tabPosition": "bottom",
     "items": [{
          "title": "Data Browser",
          "layout": "border",
          "defaults": {
               "split": true
          },
          "autoScroll": false,
          "customWidgetType": "vdBorderLayout",
          "items": [{
               "xtype": "tabpanel",
               "customWidgetType": "vdTabLayout",
               "margin": "5 0 5 5",
               "border": 1,
               "style": {
                    "borderColor": "#f6f6f6",
                    "borderStyle": "solid",
                    "borderWidth": "1px"
               },
               "displayName": "Question",
               "name": "QuestionTreeContainer",
               "itemId": "QuestionTreeContainer",
               "restURL": "/Question",
               "autoScroll": false,
               "collapsible": true,
               "titleCollapse": true,
               "collapseMode": "header",
               "collapsed": false,
               "items": [{
                    "xtype": "treepanel",
                    "customWidgetType": "vdTree",
                    "title": "Browse",
                    "name": "entityTreePanel",
                    "useArrows": true,
                    "rootVisible": false,
                    "itemId": "QuestionTree",
                    "listeners": {
                         "select": "treeClick"
                    },
                    "tbar": [{
                         "xtype": "triggerfield",
                         "customWidgetType": "vdTriggerField",
                         "emptyText": "Search",
                         "triggerCls": "",
                         "listeners": {
                              "change": "onTriggerfieldChange",
                              "buffer": 250
                         }
                    }, "->", {
                         "xtype": "tool",
                         "type": "refresh",
                         "tooltip": "Refresh Tree Data",
                         "handler": "onTreeRefreshClick"
                    }]
               }, {
                    "title": "Advance Search",
                    "xtype": "form",
                    "customWidgetType": "vdFormpanel",
                    "itemId": "queryPanel",
                    "dockedItems": [{
                         "xtype ": "toolbar",
                         "customWidgetType": "vdBBar",
                         "dock": "bottom",
                         "isDockedItem": true,
                         "items": [{
                              "xtype": "tbfill",
                              "customWidgetType": "vdTbFill"
                         }, {
                              "xtype": "button",
                              "customWidgetType": "vdButton",
                              "text": "Filter",
                              "name": "filterButton",
                              "handler": "onFilterClick"
                         }]
                    }],
                    "items": []
               }],
               "region": "west",
               "width": "20%"
          }, {
               "region": "center",
               "layout": "border",
               "defaults": {
                    "split": true
               },
               "customWidgetType": "vdBorderLayout",
               "items": [{
                    "customWidgetType": "vdFormpanel",
                    "viewModel": "QuestionViewModel",
                    "xtype": "form",
                    "displayName": "Question",
                    "title": "Question",
                    "name": "Question",
                    "itemId": "QuestionForm",
                    "bodyPadding": 10,
                    "items": [{
                         "name": "questionId",
                         "itemId": "questionId",
                         "xtype": "textfield",
                         "customWidgetType": "vdTextfield",
                         "displayName": "Question Id",
                         "margin": "5 5 5 5",
                         "fieldLabel": "Question Id<font color='red'> *<\/font>",
                         "fieldId": "489AD229-FBA6-48F7-BD0C-998F49DA78E8",
                         "minLength": "0",
                         "maxLength": "64",
                         "hidden": true,
                         "value": "",
                         "bindable": "questionId",
                         "bind": "{questionId}"
                    }, {
                         "name": "levelid",
                         "itemId": "levelid",
                         "xtype": "numberfield",
                         "customWidgetType": "vdNumberfield",
                         "displayName": "Level Id",
                         "margin": "5 5 5 5",
                         "fieldLabel": "Level Id<font color='red'> *<\/font>",
                         "allowBlank": false,
                         "fieldId": "F7D2F248-0CCF-48CF-8D9C-6C78DC323944",
                         "minValue": "0",
                         "maxValue": "11",
                         "bindable": "levelid",
                         "bind": "{levelid}",
                         "columnWidth": 0.5
                    }, {
                         "name": "question",
                         "itemId": "question",
                         "xtype": "textfield",
                         "customWidgetType": "vdTextfield",
                         "displayName": "Question",
                         "margin": "5 5 5 5",
                         "fieldLabel": "Question<font color='red'> *<\/font>",
                         "allowBlank": false,
                         "fieldId": "27D0B929-FD20-49DF-A9DB-CBE1389A2F1C",
                         "minLength": "0",
                         "maxLength": "256",
                         "bindable": "question",
                         "bind": "{question}",
                         "columnWidth": 0.5
                    }, {
                         "name": "questionDetails",
                         "itemId": "questionDetails",
                         "xtype": "textareafield",
                         "customWidgetType": "vdTextareafield",
                         "displayName": "Details",
                         "margin": "5 5 5 5",
                         "fieldLabel": "Details",
                         "fieldId": "079B3640-4A9F-4D14-BC5F-369277600DB7",
                         "bindable": "questionDetails",
                         "bind": "{questionDetails}",
                         "columnWidth": 0.5
                    }, {
                         "name": "questionIcon",
                         "itemId": "questionIcon",
                         "xtype": "textfield",
                         "customWidgetType": "vdTextfield",
                         "displayName": "Icon",
                         "margin": "5 5 5 5",
                         "fieldLabel": "Icon",
                         "fieldId": "3E8CA8FF-5DBB-49F9-899D-ED2CBA5E6A83",
                         "minLength": "0",
                         "maxLength": "64",
                         "bindable": "questionIcon",
                         "bind": "{questionIcon}",
                         "columnWidth": 0.5
                    }, {
                         "name": "versionId",
                         "itemId": "versionId",
                         "xtype": "numberfield",
                         "customWidgetType": "vdNumberfield",
                         "displayName": "versionId",
                         "margin": "5 5 5 5",
                         "value": "-1",
                         "fieldLabel": "versionId",
                         "fieldId": "447716F5-91EB-4BFC-AEA5-B2D2133F32F4",
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
                         "customId": 874,
                         "items": [{
                              "xtype": "tbfill",
                              "customWidgetType": "vdTbFill",
                              "parentId": 874,
                              "customId": 888
                         }, {
                              "customWidgetType": "vdButton",
                              "xtype": "button",
                              "name": "saveFormButton",
                              "margin": "0 5 0 5",
                              "text": "Save",
                              "hiddenName": "button",
                              "canHaveParent": false,
                              "itemId": "saveFormButton",
                              "parentId": 874,
                              "customId": 889,
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
                              "parentId": 874,
                              "customId": 890,
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
                    "xtype": "gridpanel",
                    "customWidgetType": "vdGrid",
                    "displayName": "Question",
                    "title": "Details Grid",
                    "name": "QuestionGrid",
                    "itemId": "QuestionGrid",
                    "restURL": "/Question",
                    "store": [],
                    "bodyPadding": 10,
                    "columns": [{
                         "header": "Question Id",
                         "dataIndex": "questionId",
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
                         "header": "Level Id",
                         "dataIndex": "levelid",
                         "flex": 1
                    }, {
                         "header": "Question",
                         "dataIndex": "question",
                         "flex": 1
                    }, {
                         "header": "Details",
                         "dataIndex": "questionDetails",
                         "flex": 1
                    }, {
                         "header": "Icon",
                         "dataIndex": "questionIcon",
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
                    },
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
               "viewModel": "QuestionViewModel",
               "xtype": "form",
               "displayName": "Question",
               "title": "Question",
               "name": "Question",
               "itemId": "QuestionForm",
               "bodyPadding": 10,
               "items": [{
                    "name": "questionId",
                    "itemId": "questionId",
                    "xtype": "textfield",
                    "customWidgetType": "vdTextfield",
                    "displayName": "Question Id",
                    "margin": "5 5 5 5",
                    "fieldLabel": "Question Id<font color='red'> *<\/font>",
                    "fieldId": "489AD229-FBA6-48F7-BD0C-998F49DA78E8",
                    "minLength": "0",
                    "maxLength": "64",
                    "hidden": true,
                    "value": "",
                    "bindable": "questionId",
                    "bind": "{questionId}"
               }, {
                    "name": "levelid",
                    "itemId": "levelid",
                    "xtype": "numberfield",
                    "customWidgetType": "vdNumberfield",
                    "displayName": "Level Id",
                    "margin": "5 5 5 5",
                    "fieldLabel": "Level Id<font color='red'> *<\/font>",
                    "allowBlank": false,
                    "fieldId": "F7D2F248-0CCF-48CF-8D9C-6C78DC323944",
                    "minValue": "0",
                    "maxValue": "11",
                    "bindable": "levelid",
                    "bind": "{levelid}",
                    "columnWidth": 0.5
               }, {
                    "name": "question",
                    "itemId": "question",
                    "xtype": "textfield",
                    "customWidgetType": "vdTextfield",
                    "displayName": "Question",
                    "margin": "5 5 5 5",
                    "fieldLabel": "Question<font color='red'> *<\/font>",
                    "allowBlank": false,
                    "fieldId": "27D0B929-FD20-49DF-A9DB-CBE1389A2F1C",
                    "minLength": "0",
                    "maxLength": "256",
                    "bindable": "question",
                    "bind": "{question}",
                    "columnWidth": 0.5
               }, {
                    "name": "questionDetails",
                    "itemId": "questionDetails",
                    "xtype": "textareafield",
                    "customWidgetType": "vdTextareafield",
                    "displayName": "Details",
                    "margin": "5 5 5 5",
                    "fieldLabel": "Details",
                    "fieldId": "079B3640-4A9F-4D14-BC5F-369277600DB7",
                    "bindable": "questionDetails",
                    "bind": "{questionDetails}",
                    "columnWidth": 0.5
               }, {
                    "name": "questionIcon",
                    "itemId": "questionIcon",
                    "xtype": "textfield",
                    "customWidgetType": "vdTextfield",
                    "displayName": "Icon",
                    "margin": "5 5 5 5",
                    "fieldLabel": "Icon",
                    "fieldId": "3E8CA8FF-5DBB-49F9-899D-ED2CBA5E6A83",
                    "minLength": "0",
                    "maxLength": "64",
                    "bindable": "questionIcon",
                    "bind": "{questionIcon}",
                    "columnWidth": 0.5
               }, {
                    "name": "versionId",
                    "itemId": "versionId",
                    "xtype": "numberfield",
                    "customWidgetType": "vdNumberfield",
                    "displayName": "versionId",
                    "margin": "5 5 5 5",
                    "value": "-1",
                    "fieldLabel": "versionId",
                    "fieldId": "447716F5-91EB-4BFC-AEA5-B2D2133F32F4",
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
                    "customId": 874,
                    "items": [{
                         "xtype": "tbfill",
                         "customWidgetType": "vdTbFill",
                         "parentId": 874,
                         "customId": 888
                    }, {
                         "customWidgetType": "vdButton",
                         "xtype": "button",
                         "name": "saveFormButton",
                         "margin": "0 5 0 5",
                         "text": "Save",
                         "hiddenName": "button",
                         "canHaveParent": false,
                         "itemId": "saveFormButton",
                         "parentId": 874,
                         "customId": 889,
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
                         "parentId": 874,
                         "customId": 890,
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