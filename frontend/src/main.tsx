import App from './App.svelte'

interface ipt {
    x: string;
}
export class Food {
    makeMe(x) {
        const {html} = (App as any).render({
            ipt: x
        })
        return html;
    }
}