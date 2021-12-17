import App from './App.svelte'

interface ipt {
    x: string;
    y: string;
}

export class Foo {
    makeMe(x) {
        const z: ipt = {
            x: x,
            y: x + x
        };
        const {html} = (App as any).render({
            ipt: z
        })
        return html;
    }
}