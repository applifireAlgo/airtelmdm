Ext.define('Airtelmdm.airtelmdm.shared.mdm.model.masterdatamanagment.mdmdomain.P2pitemcircleModel', {
     "extend": "Ext.data.Model",
     "fields": [{
          "name": "itemid",
          "reference": "P2pitem",
          "defaultValue": ""
     }, {
          "name": "primaryKey",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "p2itemcircleid",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "circleid",
          "reference": "Circle",
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