window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.Bloco = window.blockly.js.Bloco || {};

/**
 * Bloco
 */
window.blockly.js.Bloco.Executar = function() {
 var item;
  item = this.cronapi.json.createObjectFromString('{}');
  this.cronapi.json.setProperty(item, 'id', null);
  this.cronapi.screen.changeValueOfField("vars.valor", '');
}
