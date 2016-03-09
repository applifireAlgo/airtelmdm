Ext.define('Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.ItemtypeModel', {
     "extend": "Ext.data.Model",
     "fields": [{
          "name": "primaryKey",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "itemtypeid",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "itemtypename",
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