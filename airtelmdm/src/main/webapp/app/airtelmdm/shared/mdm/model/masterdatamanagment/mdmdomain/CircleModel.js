Ext.define('Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.CircleModel', {
     "extend": "Ext.data.Model",
     "fields": [{
          "name": "primaryKey",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "circleid",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "circlename",
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