Ext.define('Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.SpocitemModel', {
     "extend": "Ext.data.Model",
     "fields": [{
          "name": "primaryKey",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "itemid",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "itemcode",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "itemdescription",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "partnumber",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "partdescription",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "itemmainid",
          "reference": "Itemmaintype",
          "defaultValue": ""
     }, {
          "name": "manufacturerid",
          "reference": "Manufacturer",
          "defaultValue": ""
     }, {
          "name": "itemsubtypeid",
          "reference": "Itemsubtype",
          "defaultValue": ""
     }, {
          "name": "uomid",
          "reference": "Uom",
          "defaultValue": ""
     }, {
          "name": "itemcategoryid",
          "reference": "Itemcategorytype",
          "defaultValue": ""
     }, {
          "name": "itemtypeid",
          "reference": "Itemtype",
          "defaultValue": ""
     }, {
          "name": "sbpid",
          "reference": "Sbp",
          "defaultValue": ""
     }, {
          "name": "natureofitem",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "networkelement",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "model",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "technologyid",
          "reference": "Technology",
          "defaultValue": ""
     }, {
          "name": "funcclassification",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "acs",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "inventoryitem",
          "type": "boolean",
          "defaultValue": ""
     }, {
          "name": "trackablealm",
          "type": "boolean",
          "defaultValue": ""
     }, {
          "name": "taggable",
          "type": "boolean",
          "defaultValue": ""
     }, {
          "name": "repairable",
          "type": "boolean",
          "defaultValue": ""
     }, {
          "name": "serialised",
          "type": "boolean",
          "defaultValue": ""
     }, {
          "name": "leadtime",
          "type": "number",
          "defaultValue": ""
     }, {
          "name": "nmsunique",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "movable",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "moq",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "purchasable",
          "type": "boolean",
          "defaultValue": ""
     }, {
          "name": "majorasset",
          "type": "number",
          "defaultValue": ""
     }, {
          "name": "minorasset",
          "type": "number",
          "defaultValue": ""
     }, {
          "name": "customdutycode",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "glcode",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "techinical",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "modelfamily",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "versionId",
          "type": "int",
          "defaultValue": ""
     }, {
          "name": "entityAudit",
          "reference": "EntityAudit"
     }, {
          "name": "primaryDisplay",
          "type": "string",
          "defaultValue": ""
     }]
});