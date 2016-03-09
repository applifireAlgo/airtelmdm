Ext.define('Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.ItemmaintypeModel', {
     "extend": "Ext.data.Model",
     "fields": [{
          "name": "primaryKey",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "itemmaintypeid",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "itemmaintypename",
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