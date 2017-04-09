
$.trumbowyg.svgPath = 'style/trumbowyg/icons.svg';


(function ($) {
    if ($.trumbowyg) {
        var configurations = {
            core: {},
            plugins: {
                btnsDef: {
                    // Customizables dropdowns
                    image: {
                        dropdown: ['insertImage', 'base64', 'noembed'],
                        ico: 'insertImage'
                    }
                },
                btns: [
                    ['viewHTML'],
                    ['undo', 'redo'],
                    ['formatting'],
                    'btnGrp-design',
                    ['link'],
                    ['image'],
                    'btnGrp-justify',
                    'btnGrp-lists',
                    ['foreColor', 'backColor'],
                    ['preformatted'],
                    ['horizontalRule'],
                    ['fullscreen']
                ],
                plugins: {
                    // Add imagur parameters to upload plugin
                    upload: {
                        serverPath: 'https://api.imgur.com/3/image',
                        fileFieldName: 'image',
                        headers: {
                            'Authorization': 'Client-ID 9e57cb1c4791cea'
                        },
                        urlPropertyName: 'data.link'
                    }
                }
            }
        };
      var Textarea = $('#trumbowyg');
      Textarea.trumbowyg(configurations.plugins);
    }
})(jQuery);
