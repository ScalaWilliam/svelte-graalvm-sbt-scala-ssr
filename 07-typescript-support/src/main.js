import App from './App.svelte'

export class Foo {
    makeMe(x) {
        const {html} = App.render({
            ipt: x
        })
        return html;
    }
}